public class AmstrongNumber{
    public static void main(String[] args) {
        int n=153;
        int temp=n;
        int counter=0;
        while(n>0){
            counter++;
            n/=10;  
        }
        int sum=0;
        n=temp;
        while(n>0){
            int d=n%10;
            int prod=1;
            for(int i=1;i<=counter;i++){
                prod=prod*d;
            }
            sum+=prod;
            n=n/10;
        }if(sum==temp){
            System.out.println("Amstrong");
        }else{
             System.out.println("not a Amstrong");
        }
    }
}
















// public class AmstrongNumber {
//     public static void main(String[] args) {
//         int n=1634;
//         int temp=n;
//         int sum=0;
//         while(n>0){
//             int LD=n%10;
//             int d=LD*LD*LD*LD;
//             sum=sum+d;
//             n=n/10;
//         }if(temp==sum){
//             System.out.println("Amstrong number");
//         }else{
//              System.out.println("not a Amstrong number");
//         }

//     }
// }

public class StrongNumber {
    public static void main(String[] args) {
        int n = 145;
        int sum=0;
        int temp=n;
        while(n>0){
            int prod =1;
            int d=n%10;
            for(int i=1;i<=d;i++){
                   prod=prod*i;
            }
            sum=sum+prod;
        n=n/10;
        // System.out.println(sum);
        }System.out.println(sum);
        if(temp==sum){
          System.out.println("Strong number");
        }else{
            System.out.println("Not a Strong number");
        }

        
    }

}


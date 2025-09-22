public class AutomorphicNumber {
    public static void main(String[] args) {
        int n=25;
        int s=n*n;
        boolean automorph =true;
        while(n>0){
            if(n%10 != s%10){
                 automorph=false;
                 break;
            }
            n=n/10;
            s=s/10;
            
        }if(automorph){
            System.out.println("the number is a automorph");
        }else{
             System.out.println("the number is not a automorph");
        }
    }
}

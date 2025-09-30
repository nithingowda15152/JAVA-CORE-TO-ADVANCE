public class PrimeNumber {
    public static void main(String[] args) {
        int n=15;
        boolean prime=true;
        for(int i=2;i<=n/2;i++){
            if(n%i==0){
                prime=false;
                break;
            }
        }if(prime&&n>=2){
            System.out.println("Prime");
        }
        else{
         System.out.println("not a Prime");
        }
    }
}
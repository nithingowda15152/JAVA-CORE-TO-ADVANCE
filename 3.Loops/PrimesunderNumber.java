public class PrimesunderNumber {
    public static void main(String[] args) {
        for(int n=20;n<=100;n++){
            boolean prime=true;
            for(int i=2;i<=n/2;i++){
                if(n%i==0){
                    prime=false;
                    break;
                }
            }if(prime){
                System.out.println(n);
            }
        }
    }
}

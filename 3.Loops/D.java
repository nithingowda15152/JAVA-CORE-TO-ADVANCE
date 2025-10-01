public class D {
    public static void main(String[] args) {
        int n=8;
        boolean prime =true;
        for(int i=2;i<=n/2;i++){
            if(n<=1)continue;
            if(n%i==0){
                prime=false;
                break;
            }
        }System.out.println(prime);
    }
}
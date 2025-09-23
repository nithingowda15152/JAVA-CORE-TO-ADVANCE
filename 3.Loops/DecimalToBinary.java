public class DecimalToBinary {
    public static void main(String[] args) {
        int n=75;
        int bin=0;
        int i=1;
        while(n>0){
            int bit=n%2;
            bin=(bit*i)+bin;
            n=n/2;
            i*=10;
        }System.out.println(bin);
    }
}
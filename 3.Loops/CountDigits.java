public class CountDigits {
    public static void main(String[] args) {
        int n=04500;
        int i=0;
        for(;n!=0;i++){
            n=n/10;
        }System.out.println(i);
    }
}
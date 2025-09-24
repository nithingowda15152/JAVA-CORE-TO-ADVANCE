public class FibUnderNumber {
    public static void main(String[] args) {
    int n=10;
    int a=0;
    int b=1;
    int sum=0;
    while(a<=n){
        System.out.println(a);
        sum=a+b;
        a=b;
        b=sum;
    }
}
}

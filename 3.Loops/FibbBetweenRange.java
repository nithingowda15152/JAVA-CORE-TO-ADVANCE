public class FibbBetweenRange {
    public static void main(String[] args) {
    int l=20;
    int u=100;
    int a=0;
    int b=1;
    int sum=0;
    while(a<=u){
        if(a>=l){
            System.out.println(a);
        }sum=a+b;
            a=b;
            b=sum;
}
}
}
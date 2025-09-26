public class LCM {
    public static void main(String[] args) {
       int a=15;
       int b=27;
       int i=a>b?a:b;
       while(true){
        if(i%a==0 && i%b==0){
            break;
        }i++;
       }System.out.println(i);
}
}

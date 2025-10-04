public class ReturnValue2 {
    public static void main(String[] args) {
        int a=5;
        m1(a);
        System.out.println("in main="+a);
    }static void m1(int a){
        a=a*3;
        System.out.println("Inside m1="+a);
        
}
}

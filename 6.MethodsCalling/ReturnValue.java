public class ReturnValue {
    public static void main(String[] args) {
        m1(5);
        int i=6;
        m1(i);
        m1(i*3);
    }static void m1(int a){
       System.out.print("a"+a);
    }
}

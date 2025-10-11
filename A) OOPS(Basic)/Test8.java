class A{
    int i;
    void m1(){
        int i=1;
        System.out.println(i);
        System.out.println(this.i);
        }
}
public class Test8 {
    public static void main(String[] args) {
        A a1=new A();
        a1.i=10;
        a1.m1();
        A a2=new A();
        a2.i=20;
        a2.m1();
    }
    
}
//Use of This keyword(To call the current object/called object)

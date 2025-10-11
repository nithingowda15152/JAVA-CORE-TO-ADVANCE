class A{
    int i;
    int j;
     void m1(){
        System.out.println(this.i);
        m2();
     }
     void m2(){
        int j=10;
        System.out.println(this.j);
     }
}
public class Test10 {
    public static void main(String[] args) {
        A a1=new A();
        a1.i=10;
        a1.j=20;
    
        a1.m1();
    }
}
//It is a example for how this keyword works

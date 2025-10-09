class A{
    static int i;
    int j;
    static void m1(){
        System.out.println(i);
    }
    void m2(){
        System.out.println(j);
    }
    public static void main(String[]args){
        m1();
        A a1=new A();
        a1.m2();
    }
}

//non static members cannot be refered directly from static methods
//non static members can be refered directly from non static methods of same class
public class VoidReturnType{
    public static void main(String[] args) {
        m1();
    }static void m1(){
        System.out.println("Executing M1");
        return;//not mandatory(because of void return type)
    }
}
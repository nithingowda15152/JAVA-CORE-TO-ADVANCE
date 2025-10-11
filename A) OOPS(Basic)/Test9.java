public class Test9 {
    int i;
    public static void main(String[] args) {
        System.out.println(this.i);//compile time error
    }
}
//non-static variable this cannot be referenced from a static context

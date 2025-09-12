public class staticVariable{
    static int i=20;
    public static void main(String[]args){
        System.out.println(staticVariable.i);
        staticVariable.i=40;
        System.out.println(staticVariable.i);
    }
}
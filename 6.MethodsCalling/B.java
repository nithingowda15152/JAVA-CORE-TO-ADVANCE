public class B {
    public static void main(String[] args) {
        System.out.print(m1());
    }
    static boolean m1(){
        int n=5;
        if(n%2==0){
            return true;
        }return false ;//it is necessary because IF-->if-cond becomes false,there is no other statement left to print
    }
}

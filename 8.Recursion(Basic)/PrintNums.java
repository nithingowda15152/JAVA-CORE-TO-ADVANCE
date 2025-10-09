public class PrintNums {
    public static void main(String[] args) {
        System.out.println(countdown(5));
    }static int countdown(int n){
        if(n==1){
            return 1;
        }System.out.println(n);
        return countdown(n-1);    
    }
}

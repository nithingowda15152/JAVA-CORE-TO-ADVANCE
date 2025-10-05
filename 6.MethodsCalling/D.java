public class D {
    public static void main(String[] args) {
        System.out.print(add(4,5,6));
        
    }static int add(int ...a){
        int sum=0;
        for(int n:a){
        sum+=n;
        }
        return sum;
    }
}

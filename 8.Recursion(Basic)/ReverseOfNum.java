public class ReverseOfNum {
    public static void main(String[] args) {
        Reverse(1234);
    }static void Reverse(int n){
        if(n==0)return;
        System.out.println(n%10);
        Reverse(n/10);
    }
}

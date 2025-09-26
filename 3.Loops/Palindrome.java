public class Palindrome {
    public static void main(String[] args) {
        int n=1245;
        int temp=n;
        int rev=0;
        while(n>0){
            int d=n%10;
            rev=(rev*10)+d;
            n=n/10;
        }System.out.println(rev);
        if(rev==temp){
             System.out.println("palindrome");
        }else{System.out.println("Not palindrome");}
    }
}
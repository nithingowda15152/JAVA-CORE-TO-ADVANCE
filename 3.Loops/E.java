import java.util.*;
public class E {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int max=n;
        int min =n;
        if(n>0){
            while(true){
            n=sc.nextInt();
             if(n<0){
                break;
             }if(n>max){
                max=n;
             }if(n<max){
                min=n;
             }
        }System.out.println("max is"+max +" min is"+min);
        }System.out.println(" n is ivalid");
    }
}

import java.util.*;
public class CurrencyCounter {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Amount in mhultiple of 100:");
        int a=sc.nextInt();
        if(a>=2000){
            System.out.println("2000 X "+(a/2000));
            a=a%2000;
        }if(a>=1000){
            System.out.println("1000 X "+(a/1000));
            a=a%1000;
        }if(a>=500){
            System.out.println("500 X "+(a/500));
            a=a%500;
        }if(a>=200){
            System.out.println("200 X "+(a/200));
            a=a%200;
        }if(a>=100){
            System.out.println("100 X "+(a/100));
            a=a%100;
        }
}
}

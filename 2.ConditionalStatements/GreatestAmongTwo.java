import java.util.*;
public class GreatestAmongTwo {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the number:");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
          System.out.println("A is greatest");
        }else{
            System.out.println("B is greatest");
        }
    }
}

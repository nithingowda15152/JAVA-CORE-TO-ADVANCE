import java.util.*;
public class MarriageEligible {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the Age:");
        int a=sc.nextInt();
        if(a>28){
            if(a<32){
                System.out.print("Search a girl");
            }else{
                System.out.print("Age baara");
            }
        }else{
            System.out.print("concentrate on studies");
        }
        
    }
}

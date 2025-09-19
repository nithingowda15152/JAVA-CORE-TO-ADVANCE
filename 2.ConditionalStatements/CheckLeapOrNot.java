import java.util.*;
public class CheckLeapOrNot {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the year:");
        int y=sc.nextInt();
        if(y%400==0){
            System.out.print("its Leap year");
        }else if(y%100!=0 && y%4==0){
             System.out.print("Leap year");
        }else{
            System.out.print("its not a Leap year");
        }
        
        
    }
}

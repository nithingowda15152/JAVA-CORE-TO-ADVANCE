import java.util.*;
public class SwitchStatement{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a week day number:");
        int d=sc.nextInt();
        switch(d){
            case 1:System.out.print("its monday");break;
            case 2:System.out.print("its tuesday");break;
            case 3:System.out.print("its wednesday");break;
            case 4:System.out.print("its thursday");break;
            case 5:System.out.print("its friday");break;
            case 6:System.out.print("its saturday");break;
            case 7:System.out.print("its sunday");break;
            default :System.out.print("invalid");
        }
    }
}

import java.util.Scanner;
public class L{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=5;i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }for(int j=i;j<=5;j++){
                System.out.print(j);
            }
        System.out.println(); 
    }
    }
}
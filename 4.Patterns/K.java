import java.util.Scanner;
public class K{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=5;i>=1;i--){
            for(int j=1;j<=i-1;j++){
                System.out.print(" "+" ");
            }for(int j=5;j>=i;j--){
                System.out.print(j+" ");
            }
        System.out.println();
        
    }
    }
}
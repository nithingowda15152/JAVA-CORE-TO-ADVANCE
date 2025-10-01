import java.util.Scanner;
public class I{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            char ch='A';
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
        }
        System.out.println();
        
    }
    }
}
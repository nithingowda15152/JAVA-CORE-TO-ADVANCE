import java.util.Scanner;
public class D2{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.println(i+" "+j);
                if(i%2==0) break;
            }if(i%3==0) break;
        }
    }
}
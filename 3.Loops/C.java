import java.util.Scanner;
public class C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum=0;
        while(sum<=100){
            System.out.print("Enter the number");
            int n=sc.nextInt();
            sum=sum+n;
        }System.out.print("Done");
    }
}

import java.util.Scanner;
public class E2{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=5;j>=i;j--){
                System.out.println(i+" "+j);
        }}
    }
}
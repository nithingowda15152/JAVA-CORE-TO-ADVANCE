import java.util.Scanner;
public class Pattern1{
    public static void main(String[] args) {
        System.out.print("Enter a number: ");
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                for(int j=1;j<=n;j++){
                    System.out.print(j);
                }
            }if(i%2==0){
                for(int j=n;j>=1;j--){
                    System.out.print(j);
                }
            }System.out.println();
        }
    }
    }
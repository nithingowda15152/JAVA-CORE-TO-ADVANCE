import java.util.*;
public class Patt2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                int x=((i-1)*n)+1;
                for(int j=1;j<=n;j++){
                    System.out.print(x+" ");
                    x++;
                }
            }
                else{
                    int x=i*n;
                    for(int j=1;j<=n;j++){
                    System.out.print(x+" ");
                    x--;
                    }
                }System.out.println();
        
    }
}
}

public class HcfGcd {
    public static void main(String[] args) {
        int a =98;
        int b=56;
        while(a!=b){
            if(a==0){
                System.out.println(b);
                break;
            }if(b==0){
                System.out.println(a);
                break; 
            }if(a>b){
                a=a-b;
            }if(b>a){
                b=b-a;
            }
        }if(a==b){
            System.out.println(a);
        }
    }
}

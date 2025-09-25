public class hcfgcdQSP {
    public static void main(String[] args) {
        int a =12;
        int b=18;
        int i=a<b?a:b;
        if (a == 0 && b == 0) {
            System.out.println("GCD is undefined for 0 and 0.");
        } else if (a == 0) {
            System.out.println("GCD is: " + b);
        } else if (b == 0) {
            System.out.println("GCD is: " + a);
        }else{
            while(true){
              if(a%i==0 && b%i==0){
                break;
            }i--;
        }System.out.println(i);
    }
    }

}

public class E {
    public static void main(String[] args) {
        pow(4,5);
    }static double pow(double a,double b){
        int n=(int)Math.pow(a,b);
        System.out.println(n);
        return n;
    }
}
//The return value is double, but it's not printed, so you never see the .0 in output.
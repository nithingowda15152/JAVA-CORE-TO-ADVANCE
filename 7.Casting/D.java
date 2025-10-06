public class D {
    public static void main(String[] args) {
        System.out.println(pow(4,5));
    }static double pow(double a,double b){
        int n=(int)Math.pow(a,b);
        return n;
    }
}

//returning an int (n = 1024), but because the method's return type is double, Java automatically converts 1024 to 1024.0.

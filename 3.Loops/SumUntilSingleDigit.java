public class SumUntilSingleDigit {
    public static void main(String[] args) {
        int n = 29999;
        System.out.println(n);
        while(n>9){
            int sum=0;
            while(n>0){
                sum=sum+(n%10);
                n/=10;
            }System.out.println(sum);
            n=sum;
        }
    }

}


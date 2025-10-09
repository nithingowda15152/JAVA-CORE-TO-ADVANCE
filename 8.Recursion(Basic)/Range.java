public class Range {
    public static void main(String[] args) {
        range(5,10);
    }static int range(int a,int b){
        if(a>b){return a;
        }System.out.println(a);
        return range(a+1,b);
    }
}


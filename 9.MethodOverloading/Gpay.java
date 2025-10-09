public class Gpay {
    public static void payment(String UPI,int password){
        if(UPI.equals("6363@cnr")){
            if(password==1234){
                System.out.println("Valid pass and payment succesfull");
            }else{
                System.out.println("Invalid Pass");
            }
        }else{
            System.out.println("Invalid email");
        }
    }public static void payment(int Number,int password){
        if(Number==636360){
            if(password==1234){
                System.out.println("Valid pass and payment succesfull");
            }else{
                System.out.println("Invalid Pass");
            }
        }else{
            System.out.println("Invalid Number");
        }
    } 
    public static void main(String[]args){
        Gpay.payment("6363@cnr",1234);
        Gpay.payment(636360,1234);
    }
}

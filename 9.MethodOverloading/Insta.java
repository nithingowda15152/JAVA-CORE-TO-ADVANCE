public class Insta {

    // Login using username and password
    public void login(String username, String password) {
        if (username.equals("nithin1506") && password.equals("NN1506")) {
            System.out.println("Login successful using username and password.");
        } else {
            System.out.println("Invalid username or password.");
        }
    }

    // Login using email and password
    public void login(String email, int password) {
        if (email.equals("NN@1506.com") && password==1234) {
            System.out.println("Login successful using email and password.");
        } else {
            System.out.println("Invalid email or password.");
        }
    }

    // Login using phone number and OTP
    public void login(long phoneNumber, int otp) {
        if (phoneNumber == 63631506L && otp == 123456) {
            System.out.println("Login successful using phone number and OTP.");
        } else {
            System.out.println("Invalid phone number or OTP.");
        }
    }

    public static void main(String[] args) {
        Insta insta = new Insta();

        insta.login("nithin1506", "NN1506"); 
        insta.login("NN@1506.com", 1234); 
        insta.login(63631506L, 123456);  
    }
}

class Account{
    double bal;
}
public class Test4 {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.bal=1000;
        System.out.println(a1.bal);

        a1=new Account();
        a1.bal=1000;
        System.out.println(a1.bal);

        //To delete the adress account
        a1=new Account();
        a1=null;
        System.out.println(a1.bal);//NullPointerException
    }
}
/* THIS IS ALSO EXAMPLE FOR HOW OBJECT REFERENCES WORKS IN MEMORY

Here a1 references for object Account is created and initialized and printed.
Then,a new loc for a1 references of sam object is created(which will be by default value is 0.0)
Now we cannot access the value of first reference(a1),because a new object location is created and old one has no refrences now,
then it will be ABONDON OBJECT

And also,
 a1=new Account();
 Here a1 cannot be declared again like(Account a1=new Aqccount),Because-Account is already declared/cannot declare twice.
 So here only initialization/modification took place[This is for only same name variables]
 
 */
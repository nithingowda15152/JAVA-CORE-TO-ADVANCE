class Account{
    double bal;
}
public class Test3 {
    public static void main(String[] args) {
        Account a1=new Account();
        a1.bal=1000;
        System.out.println(a1.bal);

        Account a2;
        a2=a1;
        a2.bal=2000;
        System.out.println(a1.bal);

    }
}
/* How object references work in memory.

 1️)Objects live in the heap memory
 2)new Account() creates one object.
 3)Variables like a1 and a2 are references (they hold the address of that object)

 4)When you write a2 = a1;,
  both references point to the same object
  So,changing through one reference (a2) also affects the other (a1)

 */
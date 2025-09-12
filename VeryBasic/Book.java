public class Book {
    String title;
    String author;
    public static void main(String[]args){
        Book b1=new Book();
        b1.title="HOW TO BECOME RICH";
        b1.author="NITHIN";
        Book b2=new Book();
        b2.title="HOW TO BECOME EXPERT IN JAVA";
        b2.author="RAVESSH";
    
        System.out.println(b1.title);
        System.out.println(b1.author);
        System.out.println("------");
        System.out.println(b2.title);
        System.out.println(b1.title);
}
}
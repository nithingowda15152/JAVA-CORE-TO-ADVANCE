class circle{
    int radius;
    void area( ){
        System.out.println(3.14*radius*radius);
    }
}
class utility{
    static void perimeter(circle c){
        System.out.println(2*3.14*c.radius);
    }
}
public class Test7 {
    public static void main(String[] args) {
        circle c1=new circle();
        c1.radius=10;
        c1.area();

        utility.perimeter(c1);
    }
}
//FINDING AREA AND PERIMETER---Inter-class communication via object passing
/*
Here circle, a non static method is created contains non static var(used to calc the arrea)
And object is created in main method and radius is initialized
Then a new non static method utlity is created(basically it will be helper method)
   -this utility method doesn't need any object creation because it doesnt use any of its variable,it access the record of class circle to give output
   Then it make sense to make method static

   c is the parameter passed in method of type circle
   radius is also from circle class
   methos should be call like---ClassName.MethodName(Parameter)
*/

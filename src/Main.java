//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        // circle test
        System.out.println("------------------------------Circle------------------------------");
        Circle circle1=new Circle(5.5);
        System.out.println("The radius of the circle is "+circle1.getRadius());
        circle1.setRadius(6.5);
        System.out.println(circle1);
        System.out.println("The area of the circle is "+circle1.calculateArea());
        System.out.println("The circumference of the circle is "+circle1.calculateCircumference());

        //rectangle test
        System.out.println("------------------------------Rectangle------------------------------");
        Rectangle rectangle1=new Rectangle(5,5.5);
        System.out.println("The height of the rectangle is "+rectangle1.getHeight());
        System.out.println("The width of the rectangle is "+rectangle1.getWidth());
        rectangle1.setHeight(4.5);
        rectangle1.setWidth(6.5);
        System.out.println(rectangle1);
        System.out.println("The area of the rectangle is "+rectangle1.calculateArea());
        System.out.println("The perimeter of the rectangle is "+rectangle1.calculateCircumference());

        //triangle test
        System.out.println("------------------------------Triangle------------------------------");
        Triangle triangle1 =new Triangle(10,3);
        System.out.println("The height of the triangle is "+ triangle1.getHeight());
        System.out.println("The base of the triangle is "+ triangle1.getBase());
        triangle1.setHeight(20);
        triangle1.setBase(5);
        System.out.println(triangle1);
        System.out.println("The area of the triangle is "+ triangle1.calculateArea());
        System.out.println("The perimeter of the triangle is "+ triangle1.calculateCircumference());

    }
}
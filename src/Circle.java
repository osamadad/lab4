public class Circle extends Shape {
    private double radius;
    private final double pi = 3.14;                   /* added to make calculation easier */

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return Math.floor((this.pi * (Math.pow(this.radius, 2)))*100)/100;
    }

    @Override
    public double calculateCircumference() {
        return (2 * this.pi * this.radius);
    }

    @Override
    public String toString() {
        return "This circle radius is " + this.radius;
    }
}

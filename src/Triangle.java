public class Triangle extends Shape {
    private double height;
    private double base;

    public Triangle() {
    }

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    @Override
    public double calculateArea() {
        return Math.floor((this.base * this.height) / 2)*100/100;
    }

    @Override
    public double calculateCircumference() {
        return Math.floor((this.base + (this.height * 2)))*100/100;
    }

    @Override
    public String toString() {
        return "This triangle base is " + this.base + ", and the height is " + this.height;
    }
}

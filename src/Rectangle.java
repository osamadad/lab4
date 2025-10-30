public class Rectangle extends Shape {
    private double height;
    private double width;

    public Rectangle() {
    }

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return Math.floor((this.height * this.width))*100/100;
    }

    @Override
    public double calculateCircumference() {
        return Math.floor(((2 * this.width) + (2 * this.height)))*100/100;
    }

    @Override
    public String toString() {
        return "This Rectangle width is " + this.width + ", and the height is " + this.height;
    }
}

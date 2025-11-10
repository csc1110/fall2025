package wk11a;

public class Rectangle extends Shape {
    private double length;
    private double width;

    public Rectangle(double x, double y, String color, double length, double width) {
        super(x, y, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void move(double x, double y) {
        super.move(-x, -y);
    }

    @Override
    public double getArea() {
        return length * width;
    }

}

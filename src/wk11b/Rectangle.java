package wk11b;


public class Rectangle extends Shape implements Drawable {
    private double length;
    private double width;

    public Rectangle() {
        this(0, 0, "Black");
    }

    public Rectangle(double x, double y, String color) {
        this(x, y, color, 1, 1);
    }

    public Rectangle(double x, double y, String color, double length, double width) {
        super(x, y, color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("I'm a rectangle");
    }

    public double getArea() {
        return length * width;
    }
}

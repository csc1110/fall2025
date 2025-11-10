package wk11a;

public class Shape {
    private double x;
    private double y;
    private String hexColor;

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.hexColor = color;
    }

    public Shape() {
        this(0, 0, "x000000");
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public double getArea() {
        return 0;
    }
}

package wk11b;

public class Shape {
    private double x;
    private double y;
    private String color;

    public Shape() {
        this(0, 0, "Black");
    }

    public Shape(double x, double y, String color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public void move(double x, double y) {
        this.x += x;
        this.y += y;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void draw() {
        System.out.println("I'm a shape");
    }

    public String dumbest() {
        return "";
    }
}

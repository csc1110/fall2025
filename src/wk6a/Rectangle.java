package wk6a;

public class Rectangle {
    private int height;
    private int width;

    public Rectangle(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getWidth() {
        return width;
    }

    public boolean setWidth(int width) {
        boolean changed = false;
        if (width != this.width) {
            this.width = width;
            changed = true;
        }
        return changed;
    }
    public int getHeight() {
        return height;
    }

    public int getPerimeter() {
        return 2 * width + 2 * height;
    }

    public int getArea() {
        return width * height;
    }

    public boolean isSquare() {
        return width == height;
    }

    @Override
    public String toString() {
        return "Rect: " + height + " x " + width;
    }

}

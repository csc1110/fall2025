package wk11a;

import java.util.List;
import java.util.ArrayList;

public class Lec1 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape());
        shapes.add(new Rectangle(2, 3, "xFFFFFF", 5, 10));
        shapes.add(new Circle(.5));
        for (Shape shape : shapes) {
            System.out.println(shape.getArea());
        }
    }
}

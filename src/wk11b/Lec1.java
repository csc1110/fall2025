package wk11b;

import java.util.ArrayList;
import java.util.List;

public class Lec1 {
    public static void main(String[] args) {
        List<Shape> shapes = new ArrayList<>();
        shapes.add(new Shape());
        shapes.add(new Rectangle(2, 2, "yellow"));
        shapes.add(new Rectangle(2, 2, "yellow", 5, 10));
        Rectangle x = (Rectangle) shapes.getFirst();
        for (Shape shape : shapes) {
            System.out.println(shape.toString());
        }
    }
}

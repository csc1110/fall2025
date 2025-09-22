package wk4b;

public class Lec1 {
    public static void main(String[] args) {
        System.out.println((int)(Math.random() * 10) - 5);
        System.out.println((int)(Math.random() * 10) - 5);
        System.out.println((int)(Math.random() * 10) - 5);
        System.out.println(Math.PI);
        System.out.println(Math.abs((float)-1.8));
        System.out.println(Math.cos(Math.toRadians(45)));
    }

    public static void main2(String[] args) {
        final int height = 3;
        final int width = 6;
        for (int row = 0; row < height; row++) {
            for (int col = 0; col < width; col++) {
                System.out.println(row + ", " + col);
            }
        }
    }
}

package wk4b;

public class Lec1 {
    public static void main(String[] args) {
        // [-6, 10]
        double rand = Math.random(); // [0, 1.0)
        double rand2 = rand * 17;    // [0, 17.0)
        int rand3 = (int)rand2;      // [0, 16]
        int rand4 = rand3 - 6;       // [-6, 10]
    }

























    public static void main3(String[] args) {
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

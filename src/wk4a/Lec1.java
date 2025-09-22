package wk4a;

public class Lec1 {
    public static void main(String[] args) {
        String name = "Noah Lastname";
        int index = name.indexOf(' ');
        String firstname = name.substring(0, index);
        System.out.println(firstname);
        System.out.println("Firstname Lastname".indexOf(' '));
        System.out.println((int)Math.pow(2, 5));
        // sine of 90 degrees
        double sineOfNinety = Math.sin(Math.toRadians(90));
        String value = Double.toString(sineOfNinety);
        String alternative = "" + sineOfNinety;
        System.out.println(-5 + (int)(10 * Math.random()));
        System.out.println(-5 + (int)(10 * Math.random()));
        System.out.println(-5 + (int)(10 * Math.random()));
        System.out.println(-5 + (int)(10 * Math.random()));
    }

    public static void main2(String[] args) {
        for (int i = 0; i < 10; i++) {
            for (int j = i; j < 10; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
}

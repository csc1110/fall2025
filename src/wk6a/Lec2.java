package wk6a;

public class Lec2 {
    public static void main(String[] args) {
        Fraction.toggleDisplayMethod();
        Fraction f = new Fraction(3);
        Fraction g = new Fraction(-1, -2);
        System.out.println(f.toString());
        System.out.println(g);
        Fraction result = f.times(g);
        System.out.println(result);
        Fraction.toggleDisplayMethod();
        System.out.println(result);
        Fraction.toggleDisplayMethod();
        System.out.println(result);

    }
}

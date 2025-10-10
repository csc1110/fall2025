package wk6b;

public class Lec2 {
    public static void main(String[] args) {
        Fraction.toggleDisplayMethod();
        Fraction val = new Fraction(1, 3);
        Fraction val2 = new Fraction(2);
        Fraction val3 = val.plus(3);
        val3 = val.plus(val2);
        System.out.println(val);
        System.out.println(val2);
        System.out.println(val3);
    }
}

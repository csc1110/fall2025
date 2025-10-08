package wk6a;

public class Fraction {
    private final int num;
    private final int den;
    private static boolean displayAsDouble = false;

    /**
     * Constructs a fraction object
     * @param numerator The desired value of the numerator
     * @param denominator The desired value of the denominator
     */
    public Fraction(int numerator, int denominator) {
        if (numerator < 0 && denominator < 0) {
            numerator *= -1;
            denominator *= -1;
        }
        if (denominator == 0) {
            System.err.println("Denominator cannot be zero. Crazy stuff may happen.");
        }
        this.num = numerator;
        this.den = denominator;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    @Override
    public String toString() {
        String result = num + "/" + den;
        if (displayAsDouble) {
            result = "" + (double)num / den;
        }
        return result;
    }

    public Fraction times(Fraction multiplicand) {
        int numer = this.num * multiplicand.num;
        int denom = this.den * multiplicand.den;
        return new Fraction(numer, denom);
    }

    public static void toggleDisplayMethod() {
        displayAsDouble = !displayAsDouble;
    }
}

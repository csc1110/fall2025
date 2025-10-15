package wk6a;

// +----------------------------------------------+
// |              Fraction                        |
// +----------------------------------------------+
// | - num: int {readOnly}                        |
// | - den: int {readOnly}                        |
// | - displayAsDouble: boolean {underline}       |
// +----------------------------------------------+
// | + Fraction(numerator: int, denominator: int) |
// | + Fraction(numerator: int)                   |
// | + times(multiplicand: Fraction) : Fraction   |
// | + plus(addend: int) : Fraction               |
// | + plus(addend: Fraction) : Fraction          |
// | + minus(val: Fraction) : Fraction            |
// +----------------------------------------------+

public class Fraction {
    public Fraction minus(Fraction val) {
        return new Fraction(this.num * val.den - val.num * this.den, this.den * val.den);
    }

    private final int num;
    private final int den;
    private static boolean displayAsDouble = false;
    // Class constant
    public final static double PI = 3.14159265358979;

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

    public Fraction plus(int addend) {
        return new Fraction(num + addend * den, den);
    }

    public Fraction plus(Fraction addend) {
        return new Fraction(num * addend.den + addend.num * den,
                den * addend.den);
    }

    public static void toggleDisplayMethod() {
        displayAsDouble = !displayAsDouble;
    }
}

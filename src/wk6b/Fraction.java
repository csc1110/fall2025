package wk6b;

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
// | + plus(addend: Fraction: Fraction            |
// | + toString() : String                        |
// | + toggleDipslayMethod() : void {underline}   |
// +----------------------------------------------+

public class Fraction {
    public static final int FAVORITE_NUMBER = 27;
    private final int num;
    private final int den;
    private static boolean displayAsDouble = false;


    /**
     * Creates a Fraction instance with initial value
     * @param numerator The numerator for this object
     * @param denominator The denominator for this object
     */
    public Fraction(int numerator, int denominator) {
        num = numerator;
        den = denominator;
    }

    public Fraction(int numerator) {
        this(numerator, 1);
    }

    public static void toggleDisplayMethod() {
        displayAsDouble = !displayAsDouble;
    }

    public Fraction times(Fraction multiplicand) {
        int newNum = this.num * multiplicand.num;
        int newDen = this.den * multiplicand.den;
        return new Fraction(newNum, newDen);
    }

    @Override
    public String toString() {
        String result = num + "/" + den;
        if (displayAsDouble) {
            result = "" + (double)num / den;
        }
        return result;
    }

    public Fraction plus(int addend) {
        return new Fraction(num + addend * den, den);
    }

    public Fraction plus(Fraction addend) {
        return new Fraction(num * addend.den + addend.num * den,
                den * addend.den);
    }
}

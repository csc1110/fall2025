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
// | + add(addend: int) : Fraction                |
// +----------------------------------------------+

public class Fraction {
    private final int num;
    private final int den;


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

    public Fraction times(Fraction multiplicand) {
        int newNum = this.num * multiplicand.num;
        int newDen = this.den * multiplicand.den;
        return new Fraction(newNum, newDen);
    }

    @Override
    public String toString() {
        String result = num + "/" + den;
        if (Math.random() < 0.5) {
            result = "" + (double)num / den;
        }
        return result;
    }
}

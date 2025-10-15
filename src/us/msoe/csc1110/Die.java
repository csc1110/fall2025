package us.msoe.csc1110;

public class Die {
    public static final int DEFAULT_NUM_SIDES = 6;
    private final int numSides;
    private int currentValue;

    public Die() {
        this(DEFAULT_NUM_SIDES);
    }

    public Die(int numSides) {
        this.numSides = numSides;
    }

    public int getCurrentValue() {
        return currentValue;
    }

    public int roll() {
        System.out.println("rolled");
        currentValue = (int)(Math.random() * numSides) + 1;
        return currentValue;
    }
}

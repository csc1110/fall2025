package wk7a;

import us.msoe.csc1110.Die;

public class Student {
    private Die d100;
    private final boolean talkative;
    private static boolean fireAlarmPulled = false;

    public Student() {
        d100 = new Die(100);
        talkative = d100.roll() <= 30;
    }

    public boolean askQuestion() {
        boolean ask = d100.roll() <= 5;
        if (talkative) {
            ask = d100.roll() <= 25;
        }
        return ask;
    }

    public boolean provideCorrectAnswer() {
        boolean correct = d100.roll() <= 70;
        if (fireAlarmPulled) {
            correct = d100.roll() <= 50;
        }
        return correct;
    }

    public static void setFireAlarmPulled(boolean pulled) {
        fireAlarmPulled = pulled;
    }
}

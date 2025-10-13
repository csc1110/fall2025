package wk7b;

import us.msoe.csc1110.Die;

public class Student {
    private static final int DEFAULT_CORRECT = 70;
    private static final int CORRECT_WITH_FIRE_ALARM = 50;
    private Die d100;
    private final boolean talkative;
    private static boolean fireAlarmPulled;
    private static final int NON_TALKATIVE_ASK_THRESHOLD = 5;
    private static final int TALKATIVE_ASK_THRESHOLD = 25;
    private static final int PERCENTAGE_TALKATIVE = 30;

    public Student(String name) {
        // name ignored
        d100 = new Die(100);
        talkative = d100.roll() <= PERCENTAGE_TALKATIVE;
    }

    public boolean askQuestion() {
        boolean ask = d100.roll() <= NON_TALKATIVE_ASK_THRESHOLD;
        if (talkative) {
            ask = d100.roll() <= TALKATIVE_ASK_THRESHOLD;
        }
        return ask;
    }

    public boolean provideCorrectAnswer() {
        boolean correct = d100.roll() <= DEFAULT_CORRECT;
        if (fireAlarmPulled) {
            correct = d100.roll() <= CORRECT_WITH_FIRE_ALARM;
        }
        return correct;
    }
}

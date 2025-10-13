package wk7a;

import us.msoe.csc1110.Die;

public class Teacher {
    private static Die d6 = new Die();
    private static Die d10 = new Die(10);
    private final int numStudents;

    public Teacher(int numStudents) {
        this.numStudents = numStudents;
    }

    public int selectStudent() {
        int studentID = 0;
        do {
            studentID = (d6.roll() - 1) * 10 + d10.roll() - 1;
        } while(studentID <= 0 || studentID > numStudents);
        return studentID;
    }

    public boolean provideCorrectAnswer() {
        return d10.roll() < 9;
    }
}

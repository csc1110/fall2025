package wk7b;

import us.msoe.csc1110.Die;

public class Teacher {
    private static Die d6 = new Die();
    private static Die d10 = new Die(10);
    private int numStudents;

    public Teacher(int numStudents) {
        this.numStudents = numStudents;
    }

    public int getNumStudents() {
        return numStudents;
    }

    public void setNumStudents(int numStudents) {
        if (numStudents > 0) {
            this.numStudents = numStudents;
        }
    }

    public int selectStudent() {
        int studentId = 0;
        do {
           studentId = (d6.roll() - 1) * 10 + (d10.roll() - 1);
        } while(studentId < 1 || studentId > numStudents);
        return studentId;
    }

    public boolean provideCorrectAnswer() {
        final int correct_decile = 8;
        return d10.roll() <= correct_decile;
    }

    public void swap(Teacher that) {
       int temp = this.numStudents;
       this.numStudents = that.numStudents;
       that.numStudents = temp;
    }
}

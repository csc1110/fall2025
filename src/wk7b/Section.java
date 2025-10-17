package wk7b;

public class Section {
    private Teacher teacher;
    private Student student1;
    private Student student2;
    private Student student3;
    public static final int TOTAL_QUESTIONS_PER_SESSION = 50;

    public Section() {
        student1 = new Student("Jane");
        student2 = new Student("Jill");
        student3 = new Student("Jana");
        teacher = new Teacher(3);
    }

    public void conductSession() {
        int totalQuestions = 0;
        while (totalQuestions < TOTAL_QUESTIONS_PER_SESSION) {
            // Give students an opportunity to ask a question
            //   If a student asks a question, count it and see if teacher gets it right

            // If not student asks a question teacher asks a question
            //   Loop until a student gets it right or until max questions have been asked

        }
    }

}

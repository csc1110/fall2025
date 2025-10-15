package wk7a;

public class Section {
    public static void main(String[] args) {
        Section csc1110 = new Section();
        csc1110.conductSession();
    }

    private Teacher teacher;
    private Student student1;
    private Student student2;
    private Student student3;
    public static final int TOTAL_QUESTIONS_PER_SESSION = 50;

    public Section() {
        student1 = new Student();
        student2 = new Student();
        student3 = new Student();
        teacher = new Teacher(3);
    }

    public void conductSession() {
        int totalQuestions = 0;
        while (totalQuestions < TOTAL_QUESTIONS_PER_SESSION) {
            // Give students an opportunity to ask a question
            //   If a student asks a question, count it and see if teacher gets it right
            boolean asks = student1.askQuestion();
            if (asks) {
                totalQuestions = askTeacherQuestion(totalQuestions);
            } else {
                asks = student2.askQuestion();
                if (asks) {
                    totalQuestions = askTeacherQuestion(totalQuestions);
                } else {
                    asks = student3.askQuestion();
                    if (asks) {
                        totalQuestions = askTeacherQuestion(totalQuestions);
                    }
                }
            }
            // If not student asks a question teacher asks a question
            //   Loop until a student gets it right or until max questions have been asked
            boolean answeredCorrectly = false;
            while (!asks && !answeredCorrectly && totalQuestions < TOTAL_QUESTIONS_PER_SESSION) {
                ++totalQuestions;
                boolean correctAnswer = student1.provideCorrectAnswer();
                if (correctAnswer) {
                    System.out.format("Student 1 answered question number %d correctly.%n", totalQuestions);
                } else if (totalQuestions < TOTAL_QUESTIONS_PER_SESSION) {
                    ++totalQuestions;
                    correctAnswer = student2.provideCorrectAnswer();
                    if (correctAnswer) {
                        System.out.format("Student  2 answered question number %d correctly.%n", totalQuestions);
                    } else if (totalQuestions < TOTAL_QUESTIONS_PER_SESSION) {
                        ++totalQuestions;
                        correctAnswer = student3.provideCorrectAnswer();
                        if (correctAnswer) {
                            System.out.format("Student 3 answered question number %d correctly.%n", totalQuestions);
                        }
                    }
                }
            }
        }
    }

    private int askTeacherQuestion(int numberOfQuestions) {
        ++numberOfQuestions;
        boolean correct = teacher.provideCorrectAnswer();
        if (correct) {
            System.out.format("Teacher answered question number %d correctly.%n", numberOfQuestions);
        }
        return numberOfQuestions;
    }

}

package wk12b;

import wk7b.Section;
import wk7b.Teacher;

public class Practice {
    public static void main(String[] args) {
        Section sec1 = new Section();
        Teacher teacher1 = new Teacher(3);
        Teacher teacher2 = new Teacher(3);
        teacher1.setNumStudents(8);   // Draw memory diagram as seen from main()
        teacher2.swap(teacher1);      // Draw memory diagram as seen from the swap() method
    }
}

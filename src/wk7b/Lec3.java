package wk7b;

public class Lec3 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(3);
        Teacher t2 = new Teacher(8);
        Teacher t3 = t1;
        stuff(t2);
        swap(t1, t2);
        t1.swap(t2);
    }

    private static String stuff() {
        return null;
    }

    private static void swap(Teacher first, Teacher second) {
        Teacher temp = first;
        first = second;
        second = temp;
//        int temp = first.getNumStudents();
//        first.setNumStudents(second.getNumStudents());
//        second.setNumStudents(temp);
    }

    private static void stuff(Teacher prof) {
        System.out.println(prof);
    }
}
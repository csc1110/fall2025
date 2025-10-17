package wk7a;

import java.util.Scanner;

public class Lec3 {
    public static void main(String[] args) {
        Scanner in = new Scanner("happy 30 days to a month from now day");
        Student stud = new Student();
        Teacher prof;
        prof = new Teacher(3);
        Teacher prof2 = prof;
        Teacher prof3 = new Teacher(5);
        prof2.setNumStudents(8);
        swap(prof, prof3);
        int i = 3;
        int j = 8;
        swap(i, j);
        System.out.println("done");
    }

    private static void swap(int first, int second) {
        int tmp = first;
        first = second;
        second = tmp;
    }

    private static void swap(Teacher prof1, Teacher prof2) {
        int temp = prof1.getNumStudents();
        prof1.setNumStudents(prof2.getNumStudents());
        prof2.setNumStudents(temp);
    }

    private static void changeStuff(Teacher stuff) {
        stuff.setNumStudents(9999);
    }
}

package wk7b;

import java.util.Random;
import java.util.Scanner;

public class Lec2 {
    public static void main(String[] args) {
        Student student = new Student("Caiden");
        Student student2 = student;
        Student student3 = new Student("Kaden");
        useless(student);
        useless(student2);
        useless(student3);
        System.out.println("done");
    }

    private static void useless(Student freddy) {
        freddy.askQuestion();
    }
}

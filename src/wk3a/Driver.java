package wk3a;

import java.util.Scanner;

// if (/* CONDITIONAL */) {
//    // Statements to run if CONDITIONAL is true
// }
//
// if (/* CONDITIONAL */) {
//    // Statements to run if CONDITIONAL is true
// } else {
//    // Statements to run if CONDITIONAL is false
// }
public class Driver {
    public static void main(String[] args) {
        System.out.print("Enter your age ");
        Scanner in = new Scanner(System.in);
        int age = in.nextInt();
        System.out.print("What color are your eyes");
        String eyeColor = in.next();
        boolean answer = (age >= 20 && age < 30 && eyeColor.equalsIgnoreCase("blue"));
        if (answer) {
            System.out.println("You are a blue eyed person in your twenties");
        }
    }

    public static void main3(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your grade on lab 3");
        int grade = in.nextInt();
        String letter = "";
        if (grade >= 90) {
            letter = "A";
        } else if (grade >= 80) {
            letter = "B";
        } else if (grade >= 70) {
            letter = "C";
        } else if (grade >= 60) {
            letter = "D";
        } else {
            letter = "F";
        }
        System.out.println("Your letter grade for lab 3 is: " + letter);
    }





    public static void main2(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = in.nextInt();
        int j = i + 3;
        i += j;
        if (i > 0) {
            System.out.println("The number is positive");
        } else if (i < 0) {
            System.out.println("The number is negative");
        } else {
            System.out.println("The number is neither positive nor negative");
        }
    }
}

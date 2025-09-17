package wk3b;

import com.sun.security.jgss.GSSUtil;

import java.util.Scanner;

// if (CONDITIONAL) {
//     Statements that run if CONDITIONAL is true
// }
//
// if (CONDITIONAL) {
//     Statements that run if CONDITIONAL is true
// } else {
//     Statements that run if CONDITIONAL is false
// }
public class Driver {
    public static void main(String[] args) {
        final boolean jerkMode = false;
        System.out.println("Tell me a secret");
        Scanner in = new Scanner(System.in);
        String secret = in.nextLine();
        System.out.println("Do you want to know a secret? (yes or no)");
        String answer = in.next();
        if (answer.equalsIgnoreCase("yes")) {
            int niceMode = 3;
            System.out.println("The secret is: " + secret);
        } else {
            if (jerkMode) {
                System.out.println("You already know secret");
            } else {
                System.out.println("I'm sorry you're not more curious");
            }
        }
        if (answer.equalsIgnoreCase("yes")) {
            System.out.println("The secret is: " + secret);
        } else if (jerkMode) {
            System.out.println("You already know secret");
        } else {
            System.out.println("I'm sorry you're not more curious");
        }
    }
}

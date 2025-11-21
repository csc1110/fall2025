package wk12a;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Lec3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int weight = -1;
        do {
            try {
                System.out.println("Please enter your weight in lbs");
                weight = in.nextInt();
                if (Math.random() < 0.5) {
                    throw new IllegalArgumentException();
                }
                System.out.println("Thank you for entering an integer value");
            } catch(InputMismatchException exception) {
                in.nextLine();
                in.close();
                System.out.print("To the nearest integer value... ");
            }
        } while(weight < 0);
    }
}

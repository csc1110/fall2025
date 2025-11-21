package wk12b;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Lec3 {
    // Stopped on the Best Practices slide
    public static void main(String[] args) {
        Scanner in = new Scanner("weight 20");
        int weight = -1;
        try {
            dumb();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        do {
            try {
                System.out.println("Please enter your weight in lbs");
                weight = in.nextInt();
                System.out.println("Thank you for entering an integer value");
            } catch (InputMismatchException exception) {
                in.nextLine();
                System.out.print("To the nearest integer value... ");
            } catch (NoSuchElementException e) {
                System.out.println("Bye");
            }
        } while (weight < 0);
    }

    public static void dumb() throws IOException {

    }
}

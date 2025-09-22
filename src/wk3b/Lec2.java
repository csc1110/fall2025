package wk3b;

import java.util.Scanner;

public class Lec2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter numbers followed by 'q' to quit.");
        int sum = 0;
        String input;
        do {
            input = in.next();
            if (!input.equals("q")) {
                sum += Integer.parseInt(input);
            }
        } while (!input.equals("q"));
        System.out.println(sum);
    }
}

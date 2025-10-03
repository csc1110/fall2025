package wk5;

import java.util.Scanner;

public class Lab4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int width = 0;
        while (true) {
            System.out.print("Enter the desired width: ");
            width = in.nextInt();
            if (width <= 0) {
                System.out.println("Enter a positive integer.");
                continue;
            }
            break;
        }
        System.out.println(width);
    }
}

package wk3b;

import java.util.Scanner;

public class Lec2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (in.hasNextInt()) {
            int value = in.nextInt();
            sum += value;
        }
        System.out.println(sum);
    }
}

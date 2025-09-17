package wk3a;

import java.util.Scanner;

public class Lec2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int sum = 0;
        while (in.hasNextInt()) {
            sum += in.nextInt();
        }
        System.out.println(sum);
    }
}

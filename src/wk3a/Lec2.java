package wk3a;

import java.util.Scanner;

public class Lec2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int evenCount = 0;
        int value;
        do {
            value = in.nextInt();
            if (value > 0 && value % 2 == 0) {
                evenCount += 1;
            }
        } while (value > 0);
        System.out.println("You entered " + evenCount + " even integers");
    }
}

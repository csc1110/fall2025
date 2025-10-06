package wk5;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("""
                Enter a phone number in the form cc-area-local,
                where cc = country code digits, area = area code digits,
                and local = local phone digits.
                Or enter q to quit:""");
        String phoneNumber = in.next();
        while (!phoneNumber.equals("q")) {
            // do the work...
            System.out.println("Enter another phone number or \"q\" to quit");
            phoneNumber = in.next();
        }
    }
}

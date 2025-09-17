package wk3a;

import java.util.Scanner;

public class Lec2 {
    public static void main(String[] args) {
        String phrase = "This is our last loop type for today.";
        int numSpaces = 0;
//        int i;
//        for (i = 0; i < phrase.length(); i++) {
//            if (phrase.charAt(i) == ' ') {
//                numSpaces++;
//            }
//        }
        int i = 0;
        while (i < phrase.length()) {
            if (phrase.charAt(i) == ' ') {
                numSpaces++;
            }
            i++;
        }
        System.out.println("Your phrase has " + numSpaces + " space in it");
    }
}

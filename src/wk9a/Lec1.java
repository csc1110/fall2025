package wk9a;

import java.util.ArrayList;
import java.util.Scanner;

public class Lec1 {
    public static void main(String[] args) {
        ArrayList<Scanner> words = new ArrayList<>();

    }
    public static void main2(String[] args) {
        String[] words = {"dog", "pig", "cat"};
        String[] words2 = enlargen(words, "owl");
        words2 = enlargen(words2, "owl");
        System.out.println(words2);
    }

    private static String[] enlargen(String[] words, String word) {
        String[] array = new String[words.length + 1];
        for(int i = 0; i < words.length; i++) {
            array[i] = words[i];
        }
        array[array.length - 1] = word;
        return array;
    }

}

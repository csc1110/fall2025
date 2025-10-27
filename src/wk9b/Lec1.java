package wk9b;

import java.util.ArrayList;

public class Lec1 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ArrayList<Integer> happy = new ArrayList<>();
        list.add("pig");
        list.add("cat");
        list.add("cow");
        System.out.println(list);
    }

    public static void main2(String[] args) {
        String[] words = {"dog", "pig", "cat"};
        String[] words2 = add(words, "owl");
        System.out.println(words2.length);
    }

    private static String[] add(String[] words, String word) {
        String[] tmp = new String[words.length + 1];
        for(int i = 0; i < words.length; i++) {
            tmp[i] = words[i];
        }
        tmp[tmp.length - 1] = word;
        return tmp;
    }
}

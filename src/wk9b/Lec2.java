package wk9b;

import java.util.ArrayList;

public class Lec2 {
    public static void main(String[] args) {
        String[] words = {"car", "alpha", "bet", "trucker", "boat"};
        ArrayList<String> list = convert(words);
        list.set(1, list.get(1) + list.get(2));
        words[1] = words[1] + words[2];
        System.out.println(getLongStrings(list));
    }

    private static String[] getLongStringsAsArray(ArrayList<String> words) {
        String[] array = new String[countLongStrings(words)];
        int index = 0;
        for (String word : words) {
            if (word.length() >= 6) {
                array[index++] = word;
            }
        }
        return array;
    }

    // At least 6 characters is considered long
    private static ArrayList<String> getLongStrings(ArrayList<String> words) {
        ArrayList<String> longWords = new ArrayList<>();
        for (String word : words) {
            if (word.length() >= 6) {
                longWords.add(word);
            }
        }
        return longWords;
    }

    // At least 6 characters is considered long
    private static int countLongStrings(ArrayList<String> words) {
        int count = 0;
        for (String word : words) {
            if (word.length() >= 6) {
                count++;
            }
        }
        return count;
    }

    private static String[] convert(ArrayList<String> words) {
        String[] array = new String[words.size()];
        for (int i = 0; i < words.size(); i++) {
            array[i] = words.get(i);
        }
        return null;
    }

    private static ArrayList<String> convert(String[] words) {
        ArrayList<String> list = new ArrayList<>();
        for (String word : words) {
           list.add(word);
        }
        return list;
    }
}

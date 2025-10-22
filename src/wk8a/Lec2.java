package wk8a;

public class Lec2 {
    public static void main(String[] args) {
        int[] nums = new int[5];
        int[] nums2 = {3, 2, 4};
        String[] words = new String[10];
        words[1] = "can";
        words[5] = "not";
        words[9] = "pig";
        words[0] = "cat";
        doubleString(words);
        print(words);
    }

    private static void print(String[] anything) {
        for(String word : anything) {
            System.out.println(word);
        }
    }
    private static void doubleString(String[] anything) {
//        for(int i = 0; i < anything.length; i++) {
//            anything[i] = anything[i] + anything[i];
//        }
        for(String word : anything) {
            word = word + word;
        }
    }
}

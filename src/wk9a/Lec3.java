package wk9a;

public class Lec3 {
    public static void main(String[] args) {
        System.out.println(rot13("help"));
        System.out.println(rot13(rot13("help")));

        // BOOLEAN EXPRESSION ? TRUE RESPONSE : FALSE RESPONSE
//        String word = 3 < 4 ? "great" : "bad";
//        System.out.println(isFirstLetterCapitalize("I am capitalized"));
//        System.out.println(isFirstLetterCapitalize(""));
//        System.out.println(isFirstLetterCapitalize(" am capitalized"));
//        System.out.println(isFirstLetterCapitalize("😊😊"));
//        System.out.println(isFirstLetterCapitalize(null));
//        long i = 55555555555L;
//        System.out.println(i++);
//        System.out.println(i);
//        System.out.println(++i);
//        char a = 'A';
//        System.out.println((int)a);
//        System.out.println(a + " hi");
//        System.out.println((char)(a + 1) + " hi");
    }

    private static String rot13(String word) {
        String result = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if (Character.isAlphabetic(letter)) {
                result += Character.toLowerCase(letter) - 'a' < 14 ? (char)(letter + 13) : (char)(letter - 13);
            } else {
                result += letter;
            }
        }
        return result;
    }

    private static boolean isFirstLetterCapitalize(String phrase) {
        return phrase != null && phrase.length() > 0 && Character.isUpperCase(phrase.charAt(0));
    }

}

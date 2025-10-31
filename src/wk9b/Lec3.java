package wk9b;

public class Lec3 {
    public static void main(String[] args) {
        char x = 'A';
        System.out.println((x));
        System.out.println(isFirstLetterCapitalized("Hi"));
        System.out.println(isFirstLetterCapitalized("ai"));
        System.out.println(isFirstLetterCapitalized(""));

    }

    private static boolean isFirstLetterCapitalized(String word) {
        return word != null && word.length() > 0 && word.charAt(0) <= 'Z' && word.charAt(0) >= 'A';
    }

    public static void main2(String[] args) {
        byte i = (byte)Math.PI;
        long x = 555555555555555l;
        long y = 555555555555555l;
        long z = x + y;
        float alpha = x;
        System.out.println(alpha);
        System.out.println(i++);
        System.out.println(i);
        System.out.println(++i);
        System.out.println(i);
//        for (int i = 0; i < 3; i = i + 1) {
//            System.out.println(i);
//        }
    }
}

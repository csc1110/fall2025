package wk12a;

public class Lec2 {
    public static void main(String[] args) {
        String phrase = "bad thing";
        System.out.println(phrase.contains("ad"));
        try {
            phrase.charAt(-1);
            System.out.println("Look at you");
        } catch(NullPointerException e) {
            System.out.println("You must pass a non-negative value that is smaller that then length of the string");
        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
    }
}

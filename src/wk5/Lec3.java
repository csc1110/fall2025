package wk5;

public class Lec3 {
    public static void main(String[] args) {
        Person sally;
        sally = new Person("Sally", "Taylor");
        Person.setDisplayFirstLast(false);
        Person sam = new Person("Sam Wilson");
        Person sam2 = new Person("Sammy Johnson");
        Person sam3 = new Person("Samuel Wittickar");
        System.out.println(sally.toString());
        System.out.println(sam.toString());
        System.out.println(sam2.toString());
        System.out.println(sam3.toString());
    }
}

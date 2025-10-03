package wk4a;

public class Lec3 {
    public static void main(String[] args) {
        Person ed = new Person("Ed", "Jones");
        Person freddy = new Person("Freddy", "Edwards");
        System.out.println(ed.firstname);
        ed.setLastname("Jones");
        Person edward = new Person();
        System.out.println("All done");
    }
}

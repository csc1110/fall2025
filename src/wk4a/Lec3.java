package wk4a;

public class Lec3 {
    public static void main(String[] args) {
        Person ed = new Person("Ed", "Jones");
        Person freddy = new Person("Freddy", "Edwards");
        System.out.println(ed.getFirstname());
        ed.setLastname("Jones");
        Person edward = new Person();
        String fullname = "Jon Dough";
        Person student = new Person(fullname);
        Person.setDisplayFirstLast(false);
        System.out.println(student.toString());
        System.out.println(ed.toString());
        System.out.println(freddy.toString());
        System.out.println(edward.toString());
    }
}

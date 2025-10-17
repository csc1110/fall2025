package wk7b;

public class Lec3 {
    public static void main(String[] args) {
        Teacher t1 = new Teacher(3);
        Teacher t2 = new Teacher(8);
        Teacher t3 = t1;
        stuff(t2);
    }

    private static void stuff(Teacher prof) {
        System.out.println(prof);
    }
}

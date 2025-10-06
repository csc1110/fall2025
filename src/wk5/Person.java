package wk5;

public class Person {
    private String firstname;
    private String lastname;
    private static boolean displayFirstLast = true;

    public static void setDisplayFirstLast(boolean display) {
        displayFirstLast = display;
    }


    public Person(String first, String last) {
        firstname = first;
        lastname = last;
    }

    public Person(String wholename) {
        int spaceIndex = wholename.indexOf(" ");
        firstname = wholename.substring(0, spaceIndex);
        lastname = wholename.substring(spaceIndex + 1);
    }

    public String toLastFirst() {
        return lastname + ", " + firstname;
    }

    public String toFirstLast() {
        return getFirstname() + " " + lastname;
    }

    public String toString() {
        String result = toFirstLast();
        if (!displayFirstLast) {
            result = toLastFirst();
        }
        return result;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getFirstname() {
        return firstname;
    }
}

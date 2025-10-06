package wk4a;

public class Person {
    private String firstname = "Ed";
    private String lastname = "Edwards";
    private static boolean displayFirstLast = true;
    private static final String DEFAULT_NAME = "Jon Dough";

    public static void setDisplayFirstLast(boolean displayMethod) {
        displayFirstLast = displayMethod;
    }

    public Person() {
        int spaceIndex = DEFAULT_NAME.indexOf(" ");
        firstname = DEFAULT_NAME.substring(0, spaceIndex);
        lastname = DEFAULT_NAME.substring(spaceIndex + 1);

    }

    public Person(String fullname) {
        int spaceIndex = fullname.indexOf(" ");
        firstname = fullname.substring(0, spaceIndex);
        lastname = fullname.substring(spaceIndex + 1);
    }

    public Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setFirstname(String name) {
        this.firstname = name;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String toFirstLast() {
        return getFirstname() + " " + lastname;
    }

    public String toLastFirst() {
        return lastname + ", " + firstname;
    }

    public String toString() {
        String result = toFirstLast();
        if (!displayFirstLast) {
            result = toLastFirst();
        }
        return result;
    }

}

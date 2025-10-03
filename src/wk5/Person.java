package wk5;

public class Person {
    private String firstname;
    private String lastname;

    public Person(String first, String last) {
        firstname = first;
        lastname = last;
    }

    public Person(String wholename) {
        int spaceIndex = wholename.indexOf(" ");
        firstname = wholename.substring(0, spaceIndex);
        lastname = wholename.substring(spaceIndex + 1);
    }

    public String displayName() {
        return lastname + ", " + firstname;
    }
}

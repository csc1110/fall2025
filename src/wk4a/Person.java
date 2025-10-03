package wk4a;

public class Person {
    String firstname = "Ed";
    String lastname = "Edwards";

    void setFirstname(String name) {
        this.firstname = name;
    }

    void setLastname(String lastname) {
        this.lastname = lastname;
    }

    Person() {

    }

    Person(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}

package wk12a;

import wk11b.ElectronicDevice;
import wk11b.Laptop;
import wk11b.Phone;

public class Lec1 {
    public static void main(String[] args) {
        ElectronicDevice device1 = new Laptop();
        Laptop laptop = null;
        if (device1 instanceof Laptop) {
            laptop = (Laptop) device1;
        }
        Phone phone = new Phone();
        device1 = phone;
        device1.turnOn();
        laptop.login("admin"); // Draw diagram when in the login method
        phone.turnOn();
        phone.play();                   // Draw diagram when on this line of main
    }
}

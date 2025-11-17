package wk11b;

import java.util.Objects;

public class Phone extends ElectronicDevice {
    private boolean isLocked;
    private boolean onCall;

    public Phone() {
        super();
        System.out.println("In Phone constructor");
        isLocked = true;
        onCall = false;
    }

    public void unlock() {
        System.out.println("In Phone.unlock()");
        isLocked = false;
    }

    public void lock() {
        System.out.println("In Phone.lock()");
        isLocked = true;
    }

    public boolean isLocked() {
        System.out.println("In Phone.isLocked");
        return isLocked;
    }

    public boolean dial(String phoneNumber) {
        System.out.println("In Phone.dial()");
        final double chanceOfAnswering = 0.5;
        System.out.println("Dialing " + phoneNumber);
        if (Math.random() < chanceOfAnswering) {
            System.out.println("Successful");
            onCall = true;
        }
        return onCall;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Phone phone)) return false;
        if (!super.equals(o)) return false;
        return isLocked == phone.isLocked && onCall == phone.onCall;
    }

    @Override
    public int hashCode() {
        return Objects.hash(isLocked, onCall);
    }

    @Override
    public String toString() {
        return "Phone{" +
                "isLocked=" + isLocked +
                ", onCall=" + onCall +
                '}';
    }

    public void hangUp() {
        System.out.println("In Phone.hangUp()");
        onCall = false;
    }

    public boolean onCall() {
        System.out.println("In Phone.onCall()");
        return onCall;
    }

    public Photo takePicture() {
        System.out.println("In Phone.takePicture()");
        return null;
    }

    @Override
    public void turnOn() {
        System.out.println("In Phone.turnOn()");
        System.out.println("Phone turned on");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("In Phone.turnOff()");
        isOn = false;
    }

    @Override
    public boolean play() {
        System.out.println("In Laptop.play()");
        boolean changed = !isPlaying;
        if (!isPlaying) {
            System.out.println("Start playing");
            isPlaying = true;
        }
        return changed;
    }

    @Override
    public boolean pause() {
        System.out.println("In Phone.pause()");
        return play();
    }

}

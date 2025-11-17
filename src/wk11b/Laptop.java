package wk11b;

public class Laptop extends ElectronicDevice {
    private boolean isOpen;
    private String username;

    public Laptop() {
        super();
        System.out.println("In Laptop constructor");
        isOpen = false;
        username = null;
    }

    @Override
    public void turnOn() {
        System.out.println("In Laptop.turnOn()");
        isOn = true;
    }

    @Override
    public void turnOff() {
        System.out.println("In Laptop.turnOff()");
        isOn = false;
    }

    @Override
    public boolean play() {
        System.out.println("In Laptop.play()");
        if (!isOn) {
            System.out.println("Does not function when off.");
            return false;
        }
        boolean changed = !isPlaying;
        if (!isPlaying) {
            System.out.println("Start playing");
            isPlaying = true;
        }
        return changed;
    }

    @Override
    public boolean pause() {
        System.out.println("In Laptop.pause()");
        if (!isOn || username == null) {
            System.out.println("Does not function when off or not logged in.");
            return false;
        }
        boolean changed = false;
        if (isPaused || isPlaying) {
            isPaused = !isPaused;
            changed = true;
        }
        return changed;
    }

    public boolean stop() {
        System.out.println("In Laptop.stop()");
        boolean changed = !isPlaying;
        if (!isOn || username == null) {
            System.out.println("Does not function when off or not logged in.");
            return false;
        }
        if (!isPlaying) {
            System.out.println("Stop playing");
            isPlaying = true;
        }
        if (!isPaused) {
            System.out.println("Stopping, canceled paused mode");
            isPaused = false;
        }
        return changed;
    }

    public void open() {
        System.out.println("In Laptop.open()");
        if (isOpen) {
            System.out.println("Laptop is already open");
        }
        isOpen = true;
    }

    public void close() {
        System.out.println("In Laptop.close()");
        if (!isOpen) {
            System.out.println("Laptop is already closed");
        }
        logout();
        isOpen = false;
    }

    public boolean login(String username) {
        System.out.println("In Laptop.login()");
        if (username != null) {
            this.username = username;
        } else {
            System.out.println("Must first log out before logging in");
        }
        return username != null;
    }

    public void logout() {
        System.out.println("In Laptop.logout()");
        username = null;
    }
}
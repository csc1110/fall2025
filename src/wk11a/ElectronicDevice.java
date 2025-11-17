package wk11a;

public abstract class ElectronicDevice {
    protected boolean isOn;
    protected boolean isPlaying;
    protected boolean isPaused;

    public ElectronicDevice() {
        System.out.println("In ElectronicDevice constructor");
        isOn = false;
        isPlaying = false;
        isPaused = false;
    }

    public boolean isPlaying() {
        System.out.println("In ElectronicDevice.isPlaying()");
        return isPlaying;
    }

    public boolean isOn() {
        System.out.println("In ElectronicDevice.isOn()");
        return isOn;
    }

    public abstract void turnOn();

    public abstract void turnOff();

    public abstract boolean play();

    public abstract boolean pause();

}

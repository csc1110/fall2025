package wk11b;

public abstract class ElectronicDevice {
    protected boolean isOn;
    protected boolean isPlaying;
    protected boolean isPaused;

    public ElectronicDevice() {
        System.out.println("In: ElectronicDevice()");
        isOn = false;
        isPlaying = false;
        isPaused = false;
    }

    public boolean isOn() {
        System.out.println("In: ElectronicDevice.isOn()");
        return isOn;
    }

    @Override
    public boolean equals(Object that) {
        if (that instanceof ElectronicDevice device) {
            return this.isOn == device.isOn && this.isPaused == device.isPaused && this.isPlaying == device.isPlaying;
        }
        return false;
    }

    public boolean isPlaying() {
        System.out.println("In: ElectronicDevice.isPlaying()");
        return isPlaying;
    }

    public abstract void turnOn();
    public abstract void turnOff();
    public abstract boolean play();
    public abstract boolean pause();
}

package JavaOOP.Week1.Inclass1;

public class Inclass1_TV {
    private int channel;
    private int volumeLevel;
    private boolean on;

    public Inclass1_TV() {
        channel = 1;
        volumeLevel = 1;
        on = false;
    }

    public void turnOn() {
        on = true;
    }

    public void turnOff() {
        on = false;
    }

    public void setChannel(int newChannel) {
        if (on && newChannel >= 1 && newChannel <= 120) {
            channel = newChannel;
        }
    }

    public void setVolume(int newVolumeLevel) {
        if (on && newVolumeLevel >= 1 && newVolumeLevel <= 7) {
            volumeLevel = newVolumeLevel;
        }
    }

    public void channelUp() {
        if (on && channel < 120) {
            channel++;
        }
    }

    public void channelDown() {
        if (on && channel > 1) {
            channel--;
        }
    }

    public void volumeUp() {
        if (on && volumeLevel < 7) {
            volumeLevel++;
        }
    }

    public void volumeDown() {
        if (on && volumeLevel > 1) {
            volumeLevel--;
        }
    }

    // Getters for channel, volumeLevel, and on
    public int getChannel() {
        return channel;
    }

    public int getVolumeLevel() {
        return volumeLevel;
    }

    public boolean isOn() {
        return on;
    }
}

package JavaOOP.Week1.Inclass1;

public class Inclass1_Main {
    public static void main(String[] args) {
        Inclass1_TV tv1 = new Inclass1_TV();

        // Turn on tv1
        tv1.turnOn();

        // Set the channel to 18
        tv1.setChannel(18);

        // Set its volume to 5
        tv1.setVolume(5);

        // Increase the volume up 1 level
        tv1.volumeUp();

        System.out.println(tv1.isOn() + "\n" + tv1.getChannel() + "\n" + tv1.getVolumeLevel());
    }
}

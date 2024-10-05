package tv;

public class Tv {
    public String color;
    public boolean power;
    public int channel;
    public static byte controller;

    public void power() {
        power = !power;
    }

    public void channelUp() {
        channel++;
    }

    public void channelDown() {
        channel--;
    }
}

import tv.Tv;

public class Main {
    public static void main(String[] args) {
        Tv tv = new Tv();
        tv.channel = 7;
        tv.channelDown();
        System.out.println(tv.channel);
    }
}
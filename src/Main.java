import tv.Tv;

public class Main {
    public static void main(String[] args) {
        Tv.controller = 1;

        System.out.printf("First TV Controller: %d\n", Tv.controller);

        Tv.controller = 2;

        System.out.printf("Second TV Controller: %d\n", Tv.controller);
    }
}
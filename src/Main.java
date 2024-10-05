import tv.Tv;

public class Main {
    public static void main(String[] args) {
        Tv tv1 = new Tv();
        Tv tv2 = new Tv();

        Tv.controller = 1;

        System.out.printf("First TV Controller: %d\n", Tv.controller);

        byte tv1Controller1 = tv1.controllerViewer();
        byte tv2Controller1 = tv2.controllerViewer();


        System.out.printf("tv1 controller: %d\n", tv1Controller1);
        System.out.printf("tv2 controller: %d\n", tv2Controller1);

        Tv.controller = 2;

        System.out.printf("Second TV Controller: %d\n", Tv.controller);

        byte tv1Controller2 = tv1.controllerViewer();
        byte tv2Controller2 = tv2.controllerViewer();

        System.out.printf("tv1 controller: %d\n", tv1Controller2);
        System.out.printf("tv2 controller: %d\n", tv2Controller2);
    }
}
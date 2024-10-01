public class Main {
    public static void main(String[] args) {
        int[] ball = new int[45];
        System.out.printf("Ball length: %d\n", ball.length);
        for (int i = 0; i < ball.length; i++) {
            ball[i] = i + 1;
            System.out.printf("Ball: %d\n", ball[i]);
        }
    }
}
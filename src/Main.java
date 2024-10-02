public class Main {
    public static void main(String[] args) {
        int[] ball = new int[45];
        System.out.printf("Ball length: %d\n", ball.length);
        for (int i = 0; i < ball.length; i++)
            ball[i] = i + 1;
        for (int i = 0; i < 5; i++) {
            double k = Math.random() * 45;
            int extract = ball[(int) k];
            System.out.printf("Extracted: %d\n", extract);
        }
    }
}
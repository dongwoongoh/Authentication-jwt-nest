package changer;

public class ReferenceChanger {
    public int execute(String message) {
        return message.hashCode();
    }

    static public int changer(int original) {
        original = 1000;
        return original;
    }
}

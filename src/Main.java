import changer.ReferenceChanger;

public class Main {
    public static void main(String[] args) {
        String assets = "Role";
        ReferenceChanger referenceChanger = new ReferenceChanger();
        int messageHashcode = referenceChanger.execute(assets);
        System.out.printf("Assets HashCode: %s\n", assets.hashCode());
        System.out.printf("MessageHashcode: %s\n", messageHashcode);
    }
}
package homework_6;

public class TestException {

    public static void main(String[] args) {
        try {
            System.err.println("level 0");
            if (true) {
                throw new Error();
            }
            System.err.println("level 1");
        } catch (Exception e) {
            System.err.println("level 2");
        }
        System.err.println("level 3");
    }
}

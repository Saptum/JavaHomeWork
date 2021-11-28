package homework_6;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Throwable t = new Exception();
            throw t;
        } catch (Exception e) {
            System.out.println("Перехвачено!");
        }
    }
}


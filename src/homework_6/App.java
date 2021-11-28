package homework_6;

public class App {
    public static void main(String[] args) {
        // тут все компилируется, Demo.test хотел Parent и мы дали ему подтип - Child
        Demo.test(new Child());
    }
}


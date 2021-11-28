package homework_6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleOfException {
    public static void myMethodWhichThrowsException() throws MyOwnException {
        System.out.println("My operations");
    }

    public static void main(String[] args) {
        try {
            ExampleOfException.myMethodWhichThrowsException();
        } catch (MyOwnException e) {
            e.printStackTrace();
        }
    }
}

    class MyOwnException extends Exception {

        public MyOwnException() {
            System.out.println("My exception");
        }
    }


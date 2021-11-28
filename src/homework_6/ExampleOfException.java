package homework_6;

import java.io.FileNotFoundException;
import java.io.IOException;

public class ExampleOfException {
    public static void myMethodWhichThrowsException() throws IOException, FileNotFoundException {
        System.out.println("My operations");
    }
    public static void main(String[] args) {
        try {
            ExampleOfException.myMethodWhichThrowsException();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }catch (IOException e){
            e.printStackTrace();
        }
        finally {
            System.exit(0);
            System.out.println("Finally code");
        }

    }
}

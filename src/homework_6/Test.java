package homework_6;

import java.io.FileWriter;
import java.io.IOException;

public class Test {
    public static void main(String[] args) throws IOException {

        FileWriter fileWriter = new FileWriter("out.txt");
        fileWriter.write("Hello World");
        fileWriter.close();

        System.out.println("Программа работает успешно!");
        System.out.println("-----------------------------");
        int a = 5;
        int b = 0;
        try {
            int c = a / b;
        } catch (ArithmeticException e) {
            System.out.println("Делить на нуль - нельзя!");
        }
        System.out.println("Программа работает успешно!");
    }
}

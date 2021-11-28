package homework_6;

public class ExampleOfException_2 {
    private static Object obj = null;

    public static void myMethodWhichThrowsException(){
        System.out.println("My operations");
        if (obj==null)
            throw new NullPointerException();
    }

    public static void main(String[] args) throws MyOwnException {
        ExampleOfException.myMethodWhichThrowsException();
    }
}

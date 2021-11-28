package homework_6;

public class TryCatch {


    public static void main(String[] args) {
        int catNumber;
        int zero;
        try {
            catNumber=1;
            zero =0;
            int result =catNumber/zero;
            System.out.println("Не увидите это сообщение!");
        }catch (ArithmeticException e){
            System.out.println("Нельзя котов делить на ноль!");
        }
        System.out.println("Жизнь продолжается");
    }
}

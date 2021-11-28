package homework_6;

public class TryCatch {
    public static void main(String[] args) {
        int catNumber;
        int zero;
        try { // мониторим код
            catNumber = 1; // у меня один кот
            zero = 1; // ноль, он и в Африке ноль
            int result = catNumber / zero;
            String[] catNames = {"Васька", "Барсик", "Мурзик"};
            catNames[3] = "Рыжик";
            System.out.println("Не увидите это сообщение!");
        } catch (ArithmeticException e) {
            System.out.println("Нельзя котов делить на ноль!");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("Ошибка: " + e.toString());
        }
        System.out.println("Жизнь продолжается");
    }
}

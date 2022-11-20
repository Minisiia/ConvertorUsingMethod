import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть суму");
        double money = scanner.nextDouble();
        System.out.println("Введіть курс");
        double exchangeRates = scanner.nextDouble();
        System.out.println("Результат конвертації - " + converter(money, exchangeRates));

    }

    static double converter(double a, double b) {
        double c = a * b;
        return c;
    }
}

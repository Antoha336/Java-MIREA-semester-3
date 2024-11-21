package Task;

import java.math.BigInteger;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число с плавающей точкой: ");
        double input = scanner.nextDouble();

        try {
            BigInteger result = Converter.convertToInteger(input);
            System.out.println("Целочисленное значение: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Ошибка: Невозможно точно преобразовать в целое число. Число слишком велико или имеет дробную часть.");
        }
    }
}

package Practice_6;

public class Main {
    public static void main(String[] args) {
        LongNumber number1 = new LongNumber(-123);
        LongNumber number2 = new LongNumber(11876);

        LongArithmetic calculator = new LongArithmetic();
        System.out.println(calculator.add(number1, number2));
        System.out.println(calculator.subtract(number1, number2));
        System.out.println(calculator.multiply(number1, number2));
    }
}

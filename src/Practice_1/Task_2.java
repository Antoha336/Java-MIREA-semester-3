package Practice_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;
        int digit;

        yuan = input.nextInt();
        digit = yuan % 10;
        if (yuan < 0) {
            System.out.println("Отрицательная сумма");
            System.exit(1);
        }
        else {
            System.out.print("Принято: " + yuan);
        }
        if (yuan % 100 >= 11 && yuan % 100 <= 19) {
            System.out.println(" китайских юаней");
        } else if (digit == 1) {
            System.out.println(" китайский юань");
        } else if (digit >= 2 && digit <= 4) {
            System.out.println(" китайских юаня");
        } else {
            System.out.println(" китайских юаней");
        }
        roubles = ROUBLES_PER_YUAN * yuan;

        System.out.println("Выдано: " + roubles + " ₽");
    }
}

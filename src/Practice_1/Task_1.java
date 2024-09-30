package Practice_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        final double ROUBLES_PER_YUAN = 11.91;
        int yuan;
        double roubles;

        yuan = input.nextInt();
        if (yuan < 0) {
            System.out.println("Отрицательная сумма");
        }
        else {
            roubles = ROUBLES_PER_YUAN * yuan;
            System.out.println(roubles);
        }
    }
}

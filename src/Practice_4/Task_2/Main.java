package Practice_4.Task_2;

public class Main {
    public static void main(String[] args) {
        Solver solver1 = new Solver(1, -3, 2);
        System.out.println("Уравнение 1:");
        solver1.solve();

        Solver solver2 = new Solver(1, -2, 1);
        System.out.println("\nУравнение 2:");
        solver2.solve();

        Solver solver3 = new Solver(1, 2, 5);
        System.out.println("\nУравнение 3:");
        solver3.solve();
    }
}


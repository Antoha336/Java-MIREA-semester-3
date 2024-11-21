package Task;

public class Main {
    public static double round(double value, int places) {
        if (places < 0) throw new IllegalArgumentException();

        long factor = (long) Math.pow(10, places);
        value = value * factor;
        long tmp = Math.round(value);
        return (double) tmp / factor;
    }

    public static void main(String[] args) {
        double startHeight = round(100.0, 2);
        double moveForce = round(9.8,2);
        double liftForce = round(2.0, 2);
        double resistanceForce = round(1.0,2);

        if (moveForce <= round(liftForce + resistanceForce,2)) {
            System.out.println("Сила, движущая вниз должна быть больше сил, движущих вверх.");
            return;
        }
        FallingObject object = new FallingObject(startHeight, moveForce, liftForce, resistanceForce);
        SimulationThread simulation = new SimulationThread(object);
        simulation.start();
    }
}
package Practice_3.app;

import Practice_3.vehicles.Car;
import Practice_3.vehicles.ElectricCar;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Anton", "123DSA");
        //System.out.println(car.ownerName); error
        //System.out.println(car.engineType); error

        ElectricCar electricCar = new ElectricCar("Stepan", "123ASD", 1000);
        //System.out.println(electricCar.engineType); error
        System.out.println(electricCar.getEngineType());
    }
}

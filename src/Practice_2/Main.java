package Practice_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car("BMW", "F367IX", "black", 2000);
        BMW.To_String();

        Car Audi = new Car("Audi", "gray");
        Audi.To_String();

        Car BaseCar = new Car();
        BaseCar.To_String();

        System.out.println(BMW.getCarAge());
        //System.out.println(BMW.model); error

        BMW.setYear(2005);
        System.out.println(BMW.getCarAge());

        System.out.println(Audi.getColor());
    }
}
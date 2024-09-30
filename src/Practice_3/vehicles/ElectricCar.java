package Practice_3.vehicles;

public class ElectricCar extends Car {
    private int batteryCapacity;

    public ElectricCar(String ownerName, String insuranceNumber, int batteryCapacity) {
        super(ownerName, insuranceNumber);
        this.batteryCapacity = batteryCapacity;
        this.engineType = "Electric";
    }

    public int getBatteryCapacity() {
        return this.batteryCapacity;
    }

    public void setBatteryCapacity(int batteryCapacity) {
        this.batteryCapacity = batteryCapacity;
    }
}

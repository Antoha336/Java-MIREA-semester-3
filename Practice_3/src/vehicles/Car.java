package vehicles;

public class Car {
    private String ownerName;
    private String insuranceNumber;
    protected String engineType;

    public Car(String ownerName, String insuranceNumber) {
        this.ownerName = ownerName;
        this.insuranceNumber = insuranceNumber;
        this.engineType = "Disel";
    }

    public String getOwnerName() {
        return this.ownerName;
    }
    public String getInsuranceNumber() {
        return this.insuranceNumber;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public void setInsuranceNumber(String insuranceNumber) {
        this.insuranceNumber = insuranceNumber;
    }
    public void setEngineType(String engineType) {
        this.engineType = engineType;
    }
}

package Task;

public class Car {
    private String model;
    private String license;
    private String color;
    private int year;

    public Car() {
        this.model = "Base models";
        this.license = "Base license";
        this.color = "Base color";
        this.year = 2024;
    }

    public Car(String model, String color) {
        this.model = model;
        this.license = "F001IX";
        this.color = color;
        this.year = 2024;
    }

    public Car(String model, String license, String color, int year) {
        this.model = model;
        this.license = license;
        this.color = color;
        this.year = year;
    }

    public void To_String() {
        System.out.println(this.model + " " + this.license + " " + this.color + " " + this.year);
    }

    public String getModel(){
        return this.model;
    }
    public String getLicense() {
        return this.license;
    }
    public String getColor() {
        return this.color;
    }
    public int getYear() {
        return this.year;
    }

    public void setModel(String model) {
        this.model = model;
    }
    public void setLicense(String license) {
        this.license = license;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public void setYear(int year) {
        this.year = year;
    }

    public int getCarAge(){
        return 2024 - this.year;
    }
}

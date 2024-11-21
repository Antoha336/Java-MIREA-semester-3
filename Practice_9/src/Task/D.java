package Task;

public class D extends C {
    private boolean flagD;

    public D(String valueA, double valueC, boolean flagD) {
        super(valueA, valueC);
        this.flagD = flagD;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class Task.D: " + valueA + ", ValueC: " + valueC + ", FlagD: " + flagD);
    }
}
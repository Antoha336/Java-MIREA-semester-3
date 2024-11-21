package Task;

public class C extends A {
    protected double valueC;

    public C(String valueA, double valueC) {
        super(valueA);
        this.valueC = valueC;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class Task.C: " + valueA + ", ValueC: " + valueC);
    }
}

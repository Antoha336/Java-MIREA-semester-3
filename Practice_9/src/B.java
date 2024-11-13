public class B extends A {
    protected int valueB;

    public B(String valueA, int valueB) {
        super(valueA);
        this.valueB = valueB;
    }

    @Override
    public void displayInfo() {
        System.out.println("Class B: " + valueA + ", ValueB: " + valueB);
    }
}
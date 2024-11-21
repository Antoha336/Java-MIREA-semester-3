package Task;

public class A {
    protected String valueA;

    public A(String name) {
        this.valueA = name;
    }

    public void displayInfo() {
        System.out.println("Class Task.A: " + valueA);
    }
}

public class Main {
    public static void main(String[] args) {
        B b1 = new B("B1", 10);
        B b2 = new B("B2", 20);
        B b3 = new B("B3", 30);

        C c1 = new C("C1", 1.5);
        C c2 = new C("C2", 2.5);
        C c3 = new C("C3", 3.5);

        D d1 = new D("D1", 4.5, true);
        D d2 = new D("D2", 5.5, false);
        D d3 = new D("D3", 6.5, true);

        CollectionManager manager = new CollectionManager();
        manager.add(b1);
        manager.add(b2);
        manager.add(b3);
        manager.add(c1);
        manager.add(c2);
        manager.add(c3);
        manager.add(d1);
        manager.add(d2);
        manager.add(d3);

        System.out.println("All elements:");
        manager.displayAll();

        System.out.println("\nAll elements except A:");
        manager.displayAllExceptA();

        System.out.println("\nAll elements except D:");
        manager.displayAllExceptD();
    }
}
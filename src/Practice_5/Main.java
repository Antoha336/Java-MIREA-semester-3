package Practice_5;

public class Main {
    public static void main(String[] args) {
        Set set = new Set(5);

        set.add(5);
        set.add(10);
        set.add(3);
        set.add(8);
        set.add(9);
        set.add(11);
        set.add(12);
        set.add(13);
        set.add(14);

        set.printSet();

        set.remove(5);
        set.printSet();

        System.out.println(set.contains(8));  // true
        System.out.println(set.contains(5));  // false
    }
}


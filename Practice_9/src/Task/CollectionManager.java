package Task;

import java.util.ArrayList;
import java.util.List;

public class CollectionManager {
    private List<A> collection = new ArrayList<>();

    public void add(A element) {
        collection.add(element);
    }

    public void displayAll() {
        for (A element : collection) {
            element.displayInfo();
        }
    }

    public void displayAllExceptA() {
        for (A element : collection) {
            if (!(element instanceof A) || element instanceof B || element instanceof C || element instanceof D) {
                element.displayInfo();
            }
        }
    }

    public void displayAllExceptD() {
        for (A element : collection) {
            if (!(element instanceof D)) {
                element.displayInfo();
            }
        }
    }
}
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class StackOnQueue {
    private final Queue<Integer> queue_1;
    private final Queue<Integer> queue_2;

    public StackOnQueue() {
        queue_1 = new LinkedList<Integer>();
        queue_2 = new LinkedList<Integer>();
    }

    public void push(int x) {
        if (queue_1.isEmpty()) {
            queue_1.add(x);
            while (!queue_2.isEmpty()) {
                queue_1.add(queue_2.remove());
            }
        } else {
            queue_2.add(x);
            while (!queue_1.isEmpty()) {
                queue_2.add(queue_1.remove());
            }
        }
    };
    public int pop() {
        if (queue_1.isEmpty()) {
            return queue_2.poll();
        } else {
            return queue_1.poll();
        }
    };
    public int top() {
        if (queue_1.isEmpty()) {
            return queue_2.peek();
        } else {
            return queue_1.peek();
        }
    };
    public boolean empty() {
        return queue_1.isEmpty() && queue_2.isEmpty();
    };
    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        result.append("[");
        Queue<Integer> queue_copy;
        if (queue_1.isEmpty()) {
            queue_copy = new LinkedList<Integer>(queue_2);
        } else {
            queue_copy = new LinkedList<Integer>(queue_1);
        }
        while (!queue_copy.isEmpty()) {
            result.append(queue_copy.remove());
            if (!queue_copy.isEmpty()) {
                result.append(", ");
            }
        }
        result.append("]");
        return result.toString();
    }
}

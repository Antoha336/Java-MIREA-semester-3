package Task;

public class Set {
    private int[] elements;
    private int size;
    private int capacity;

    public Set(int capacity) {
        this.capacity = capacity;
        this.elements = new int[capacity];
        this.size = 0;
    }

    public void add(int value) {
        if (this.contains(value)) {
            return;
        }

        if (this.size >= this.capacity * 0.75) {
            expandArray();
        }

        this.elements[size++] = value;

        this.sort();
    }

    public void remove(int value) {
        int index = binarySearch(value);
        if (index == -1) {
            return;
        }

        for (int i = index; i < this.size - 1; i++) {
            this.elements[i] = this.elements[i + 1];
        }
        this.size--;
    }

    public boolean contains(int value) {
        return binarySearch(value) != -1;
    }

    private int binarySearch(int value) {
        int left = 0;
        int right = size - 1;

        while (left <= right) {
            int mid = left + (right - left) / 2;

            if (this.elements[mid] == value) {
                return mid;
            }

            if (this.elements[mid] < value) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        return -1;
    }

    private void sort() {
        for (int i = 0; i < this.size - 1; i++) {
            for (int j = 0; j < this.size - i - 1; j++) {
                if (this.elements[j] > this.elements[j + 1]) {
                    int temp = this.elements[j];
                    this.elements[j] = this.elements[j + 1];
                    this.elements[j + 1] = temp;
                }
            }
        }
    }

    private void expandArray() {
        int newCapacity = capacity * 2;
        int[] newElements = new int[newCapacity];

        if (size >= 0) System.arraycopy(this.elements, 0, newElements, 0, size);

        this.elements = newElements;
        this.capacity = newCapacity;
    }

    public void printSet() {
        for (int i = 0; i < size; i++) {
            System.out.print(this.elements[i] + " ");
        }
        System.out.println();
    }
}

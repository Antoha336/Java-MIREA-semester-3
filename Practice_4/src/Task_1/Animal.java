package Task_1;

interface Movable {
    void move();
}

abstract class Animal {
    protected int _age;
    protected int _size;

    public Animal(int age, int size) {
        this._age = age;
        this._size = size;
    }

    public abstract int toHumanAge();

    public int getAge() {
        return this._age;
    }

    public void setAge(int age) {
        this._age = age;
    }

    public int getSize() {
        return this._size;
    }

    public void setSize(int size) {
        this._size = size;
    }

    public void move() {
        System.out.println("Animal moving");
    }
}

package Task_1;

public class Dog extends Animal implements Movable {
    public Dog(int age, int size) {
        super(age, size);
    }

    @Override
    public int toHumanAge() {
        return this._age * 7;
    }

    @Override
    public void move() {
        System.out.println("Собака двигается");
    }
}

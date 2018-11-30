package Chapter11;

/**
 * Created by averychen on 4/19/17.
 */
public class TestAnimal {

    public static void main(String[] args) {

        Dog dog = new Dog();

        dog.bark();
        dog.eat();

        Crow crow = new Crow();

        crow.fly();
        crow.eat();
    }
}

package amini.codes.headfirstdesignpattern;

public class DecoyDuck extends Duck {

    @Override
    void quack() {
        // overridden to squeak
    }

    @Override
    void swim() {

    }

    @Override
    void display() {
        // looks like a rubber duck
    }

    @Override
    void fly() {
        // overridden but does not do anything!
    }
}

package amini.codes.headfirstdesignpattern;

public class RubberDuck extends Duck implements Quackable{
    @Override
    public void quack() {
        // overridden to squeak
    }

    @Override
    void swim() {

    }

    @Override
    void display() {
        // looks like a rubber duck
    }


}

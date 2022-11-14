package amini.codes.headfirstdesignpattern;

import amini.codes.headfirstdesignpattern.behavior.FlyBehavior;
import amini.codes.headfirstdesignpattern.behavior.QuackBehavior;

public abstract class Duck {


    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;


    public Duck() {
    }

    void swim() {
        System.out.println("All ducks swim!");
    }

    void display(){
        System.out.println("All ducks shown!");
    }


    public void performQuack() {
        quackBehavior.quack();
    }

    public void performFly() {
        flyBehavior.fly();
    }
}

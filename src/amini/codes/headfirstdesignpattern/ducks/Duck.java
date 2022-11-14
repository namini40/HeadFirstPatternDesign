package amini.codes.headfirstdesignpattern.ducks;

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

    public void setFlyBehavior(FlyBehavior fb) {
        this.flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb) {
        this.quackBehavior = qb;
    }
}

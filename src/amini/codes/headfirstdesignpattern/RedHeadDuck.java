package amini.codes.headfirstdesignpattern;

import amini.codes.headfirstdesignpattern.behavior.FlyWithWings;
import amini.codes.headfirstdesignpattern.behavior.Quack;

public class RedHeadDuck extends Duck {
    public RedHeadDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }
}

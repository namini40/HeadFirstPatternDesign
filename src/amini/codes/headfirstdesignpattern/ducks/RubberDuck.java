package amini.codes.headfirstdesignpattern.ducks;

import amini.codes.headfirstdesignpattern.behavior.FlyNoWay;
import amini.codes.headfirstdesignpattern.behavior.MuteQuack;

public class RubberDuck extends Duck{
    public RubberDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
}

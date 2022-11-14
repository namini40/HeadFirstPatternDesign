package amini.codes.headfirstdesignpattern.ducks;

import amini.codes.headfirstdesignpattern.behavior.FlyNoWay;
import amini.codes.headfirstdesignpattern.behavior.MuteQuack;

public class DecoyDuck extends Duck {
    public DecoyDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new MuteQuack();
    }
}

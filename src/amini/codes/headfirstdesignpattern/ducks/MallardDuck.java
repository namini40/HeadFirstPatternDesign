package amini.codes.headfirstdesignpattern.ducks;

import amini.codes.headfirstdesignpattern.behavior.FlyWithWings;
import amini.codes.headfirstdesignpattern.behavior.Quack;

public class MallardDuck extends Duck  {

    public MallardDuck() {
        this.flyBehavior = new FlyWithWings();
        this.quackBehavior = new Quack();
    }


}

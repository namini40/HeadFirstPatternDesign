package amini.codes.headfirstdesignpattern.ducks;

import amini.codes.headfirstdesignpattern.behavior.FlyNoWay;
import amini.codes.headfirstdesignpattern.behavior.MuteQuack;
import amini.codes.headfirstdesignpattern.behavior.Quack;

public class ModelDuck extends Duck{
    public ModelDuck() {
        this.flyBehavior = new FlyNoWay();
        this.quackBehavior = new Quack();
    }

    public void display(){
        System.out.println("I`m a model duck!");
    }
}

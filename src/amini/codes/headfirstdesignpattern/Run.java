package amini.codes.headfirstdesignpattern;

import amini.codes.headfirstdesignpattern.behavior.FlyRocketPowered;
import amini.codes.headfirstdesignpattern.ducks.Duck;
import amini.codes.headfirstdesignpattern.ducks.MallardDuck;
import amini.codes.headfirstdesignpattern.ducks.ModelDuck;

public class Run {
    public static void main(String[] args) {

        Duck mallard = new MallardDuck();
        mallard.performFly();
        mallard.performQuack();

        Duck model = new ModelDuck();
        model.performFly();
        model.setFlyBehavior(new FlyRocketPowered());
        model.performFly();

    }
}

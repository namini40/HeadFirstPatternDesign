package amini.codes.headfirstdesignpattern.factory;

import amini.codes.headfirstdesignpattern.pizza.*;
import amini.codes.headfirstdesignpattern.Pizza;

public class ChicagoPizzaFactory extends SimplePizzaFactory{


    // create Chicago style izza
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        return pizza;
    }
}

package amini.codes.headfirstdesignpattern.factory;

import amini.codes.headfirstdesignpattern.pizza.cheesepizza.NYStyleCheesePizza;
import amini.codes.headfirstdesignpattern.pizza.pepperonipizza.NYStylePepperoniPizza;
import amini.codes.headfirstdesignpattern.pizza.clampizza.NYStyleClamPizza;
import amini.codes.headfirstdesignpattern.pizza.veggiepizza.NYStyleVeggiePizza;
import amini.codes.headfirstdesignpattern.Pizza;

public class NYPizzaFactory extends SimplePizzaFactory{


    // create NY style izza
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new NYStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new NYStyleVeggiePizza();
        }

        return pizza;
    }
}

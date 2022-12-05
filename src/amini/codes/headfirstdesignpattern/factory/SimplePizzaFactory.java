package amini.codes.headfirstdesignpattern.factory;

import amini.codes.headfirstdesignpattern.Pizza;
import amini.codes.headfirstdesignpattern.pizza.*;
import amini.codes.headfirstdesignpattern.pizza.cheesepizza.CheesePizza;
import amini.codes.headfirstdesignpattern.pizza.clampizza.ClamPizza;
import amini.codes.headfirstdesignpattern.pizza.pepperonipizza.PepperoniPizza;
import amini.codes.headfirstdesignpattern.pizza.veggiepizza.VeggiePizza;

public class SimplePizzaFactory {

    /*
     * SimplePizzaFactory class may have many clients. it can be used 
     * by other related classes to do different things or methods other than createPizza.
     * the factory can be a static method, the advantage of not being dependent on instance comes 
     * with the cost of not inheriting the changes to subclasses.
     */

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

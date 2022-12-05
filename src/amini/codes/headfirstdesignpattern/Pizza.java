package amini.codes.headfirstdesignpattern;

import amini.codes.headfirstdesignpattern.pizza.cheesepizza.CheesePizza;
import amini.codes.headfirstdesignpattern.pizza.clampizza.ClamPizza;
import amini.codes.headfirstdesignpattern.pizza.pepperonipizza.PepperoniPizza;
import amini.codes.headfirstdesignpattern.pizza.veggiepizza.VeggiePizza;

abstract public class Pizza {

    // this code is NOT closed for modification
    // also it may need change alot
    Pizza orderPizza(String type) {
        Pizza pizza;
        if (type.equals("cheese")) {
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new VeggiePizza();
        }

        // this is expected for any type of Pizza
        // does not changes alot
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    public abstract void prepare();

    public abstract void bake();

    public abstract void cut();

    public abstract void box();
}

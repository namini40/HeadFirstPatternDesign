package amini.codes.headfirstdesignpattern.factory;

import amini.codes.headfirstdesignpattern.pizza.cheesepizza.ChicagoStyleCheesePizza;
import amini.codes.headfirstdesignpattern.pizza.pepperonipizza.ChicagoStylePepperoniPizza;
import amini.codes.headfirstdesignpattern.pizza.clampizza.ChicagoStyleClamPizza;
import amini.codes.headfirstdesignpattern.pizza.veggiepizza.ChicagoStyleVeggiePizza;
import amini.codes.headfirstdesignpattern.Pizza;

public class ChicagoPizzaFactory extends SimplePizzaFactory {

    // create Chicago style izza
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if (type.equals("cheese")) {
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ChicagoStyleClamPizza();
        } else if (type.equals("veggie")) {
            pizza = new ChicagoStyleVeggiePizza();
        }

        return pizza;
    }
}

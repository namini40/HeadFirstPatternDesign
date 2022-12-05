package amini.codes.headfirstdesignpattern.store;

import amini.codes.headfirstdesignpattern.Pizza;
import amini.codes.headfirstdesignpattern.factory.SimplePizzaFactory;

// making it abstract so all the other regions implement their own franchises
public abstract class PizzaStore {
    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }

    public Pizza orderPizza(String type) {
        Pizza pizza;

        // how pizza is created goes to each class that implement it
        // so the class knows how it creates a pizza not the method
        pizza =  createPizza(type);

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    // the factory object moves to this method
    abstract Pizza createPizza(String type);

}

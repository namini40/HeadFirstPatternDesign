package amini.codes.headfirstdesignpattern.store;

import amini.codes.headfirstdesignpattern.Pizza;
import amini.codes.headfirstdesignpattern.factory.SimplePizzaFactory;

public class ChicagoPizzaStore extends PizzaStore{

    public ChicagoPizzaStore(SimplePizzaFactory factory) {
        super(factory);
        //TODO Auto-generated constructor stub
    }

    @Override
    Pizza createPizza(String type) {
        // create chicago style pizza
        return null;
    }
    
}

package amini.codes.headfirstdesignpattern.store;

import amini.codes.headfirstdesignpattern.Pizza;
import amini.codes.headfirstdesignpattern.factory.SimplePizzaFactory;

public class NYPizzaStore extends PizzaStore {

    public NYPizzaStore(SimplePizzaFactory factory) {
        super(factory);
        //TODO Auto-generated constructor stub
    }

    @Override
    Pizza createPizza(String type) {
        // create NY style Pizza
        return null;
    }
 
    
}

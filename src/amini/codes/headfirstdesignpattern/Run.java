package amini.codes.headfirstdesignpattern;

import amini.codes.headfirstdesignpattern.factory.ChicagoPizzaFactory;
import amini.codes.headfirstdesignpattern.factory.NYPizzaFactory;
import amini.codes.headfirstdesignpattern.store.PizzaStore;

public class Run {
    public static void main(String[] args) {

        // create pizza for chicago and NY

        NYPizzaFactory nyFactory = new NYPizzaFactory();
        PizzaStore nyStore = new PizzaStore(nyFactory);

        ChicagoPizzaFactory chicagoFactory = new ChicagoPizzaFactory();
        PizzaStore chicagoStore = new PizzaStore(chicagoFactory);

    }
}

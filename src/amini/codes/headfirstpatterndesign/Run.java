package amini.codes.headfirstpatterndesign;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Run {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + ", " + beverage.cost());

        Beverage beverage2 = new DarkRoast();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + ", " + beverage2.cost());

        Beverage beverage3 = new HouseBlend();

        beverage3 = new Mocha(beverage3);
        beverage3 = new Soy(beverage3);
        beverage3 = new Whip(beverage3);

        System.out.println(beverage3.getDescription() + ", " + beverage3.cost());

        int c;
        try {
            String dir = 
                    System.getProperty("user.dir");

            InputStream in = new LowerCaseInputStream(
                    new BufferedInputStream(
                            new FileInputStream(dir+"/test.txt")));
            while ((c = in.read()) >= 0) {
                System.out.print((char) c);
            }
            in.close();

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

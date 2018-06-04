package decorator;

import org.junit.Before;
import org.junit.Test;

/**
 * @author guoqing
 * @since ： 2018/5/27 17:42
 * description:
 */
public class DecoratorTest {
    private Beverage beverage;

    @Test
    public void test(){
        beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $ " + beverage.cost());
        Beverage beverage1 = new DarkRoast();
        beverage1 = new Mocha(beverage1);
        beverage1 = new Mocha(beverage1);
        beverage1 = new Whip(beverage1);
        System.out.println(beverage1.getDescription() + " $ " + beverage1.cost());
        Beverage beverage2 = new HouseBlend();
        beverage2 = new Soy(beverage2);
        beverage2 = new Mocha(beverage2);
        beverage2 = new Whip(beverage2);
        System.out.println(beverage2.getDescription() + " $ " + beverage2.cost());

    }

}

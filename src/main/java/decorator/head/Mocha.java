package decorator.head;

/**
 * @author guoqing
 * @since ： 2018/5/27 17:36
 * description:
 */
public class Mocha extends CondimentDecorator {
    Beverage beverage;

    public Mocha(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Mocha";
    }

    public double cost() {
        return 0.20 + beverage.cost();
    }
}

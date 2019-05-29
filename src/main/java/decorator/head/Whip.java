package decorator.head;

/**
 * @author guoqing
 * @since ： 2018/5/27 17:39
 * description:
 */
public class Whip extends CondimentDecorator {
    private Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription() + ",Whip";
    }

    public double cost() {
        return .10 + beverage.cost();
    }
}

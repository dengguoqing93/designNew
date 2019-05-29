package decorator.head;

/**
 * @author guoqing
 * @since ： 2018/5/27 17:38
 * description:
 */
public class Soy extends CondimentDecorator {
    private Beverage beverage;

    public Soy(Beverage beverage) {
        this.beverage = beverage;
    }

    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    public double cost() {
        return .15 + beverage.cost();
    }
}

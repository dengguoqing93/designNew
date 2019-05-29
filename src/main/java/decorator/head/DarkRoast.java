package decorator.head;

/**
 * @author guoqing
 * @since ： 2018/5/27 17:32
 * description:
 */
public class DarkRoast extends Beverage {
    public DarkRoast() {
        description = "Dark Roast Coffee";
    }

    public double cost() {
        return 1.05;
    }

}

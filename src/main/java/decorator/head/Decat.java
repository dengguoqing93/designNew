package decorator.head;

/**
 * @author guoqing
 * @since ： 2018/5/27 17:34
 * description:
 */
public class Decat extends Beverage {
    public Decat() {
        description = "Decat";
    }

    public double cost() {
        return 1.99;
    }
}

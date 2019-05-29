package decorator.head;

/**
 * @author guoqing
 * @since ： 2018/5/26 21:19
 * description:
 */
public abstract class Beverage {
    protected String description = "Unknown Beverage";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}

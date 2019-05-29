package decorator.head;

/**
 * @author guoqing
 * @since ： 2018/5/27 17:31
 * description:
 */
public class Espresso extends Beverage {
    public double cost() {
        return 1.99;
    }

    public Espresso(){
        description = "Espresso";
    }
}

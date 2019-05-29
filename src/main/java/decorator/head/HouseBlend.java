package decorator.head;

/**
 * @author guoqing
 * @since ： 2018/5/27 17:32
 * description:
 */
public class HouseBlend extends Beverage {
    public HouseBlend(){
        description = "House Blend Coffee";
    }

    public double cost() {
        return .89;
    }

}

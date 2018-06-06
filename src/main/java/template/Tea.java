package template;

/**
 * @author guoqing
 * @since ： 2018/6/6 19:22
 * description:
 */
public class Tea extends CaffeineBeverage {
    public void brew() {
        System.out.println("Steeping the tea");
    }

    public void addCondiments() {
        System.out.println("Adding Lemon");
    }
}

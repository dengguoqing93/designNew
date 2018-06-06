package template;

/**
 * @author guoqing
 * @since ： 2018/6/6 19:23
 * description:
 */
public class Coffee extends CaffeineBeverage {
    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");

    }
}

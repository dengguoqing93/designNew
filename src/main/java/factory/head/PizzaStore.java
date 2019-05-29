package factory.head;

/**
 * 披萨商店
 *
 * @author dengguoqing
 * @date 2019/5/29
 */
public abstract class PizzaStore {

    /**
     * 生产一个pizza
     * @param type 披萨类型
     * @return factory.head.Pizza
     * @author dengguoqing
     * @date 2019/5/29
     * @since 1.0
     */
    public Pizza orderPizza(String type) {

        Pizza pizza = createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    /**
     * 创建pizza
     *
     * @param type pizza类型
     * @return Pizza
     */
    protected abstract Pizza createPizza(String type);
}

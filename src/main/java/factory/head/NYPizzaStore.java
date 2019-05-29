package factory.head;

/**
 * 纽约披萨店
 *
 * @author dengguoqing
 * @date 2019/5/29
 */
public class NYPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (Constant.CHEESE.equals(type)) {
            return new NYStyleCheesePizza();
        }
        return null;
    }
}

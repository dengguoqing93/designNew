package factory.head;

/**
 * 芝加哥披萨店
 *
 * @author dengguoqing
 * @date 2019/5/29
 */
public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if (Constant.CHEESE.equals(type)) {
            return new ChicagoStyleCheesePizza();
        }
        return null;
    }
}

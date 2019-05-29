package factory.head;

/**
 * 芝加哥披萨
 *
 * @author dengguoqing
 * @date 2019/5/29
 */
public class ChicagoStyleCheesePizza extends Pizza {
    public ChicagoStyleCheesePizza() {
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Shredded Mozzarella cheese");

    }

    @Override
    void cut() {
        System.out.println("Cutting the pizza into square slices");
    }
}

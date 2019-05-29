package factory.head;

/**
 * 纽约风味的芝士披萨
 *
 * @author dengguoqing
 * @date 2019/5/29
 */
public class NYStyleCheesePizza extends Pizza {
    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("grated Reggiano Cheese");
    }
}

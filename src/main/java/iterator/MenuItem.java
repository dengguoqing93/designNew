package iterator;

/**
 * @author guoqing
 * @since ： 2018/6/6 20:18
 * description:
 */
public class MenuItem {
    String name;
    String description;
    double price;
    boolean vegetarian;

    public MenuItem(String name, String description, boolean vegetarian, double price) {
        this.name = name;
        this.description = description;
        this.vegetarian = vegetarian;
        this.price = price;
    }

    public String getName() {
        return name;
    }


    public String getDescription() {
        return description;
    }


    public double getPrice() {
        return price;
    }

    public boolean isVegetarian() {
        return vegetarian;
    }
}

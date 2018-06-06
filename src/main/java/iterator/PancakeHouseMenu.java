package iterator;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoqing
 * @since ： 2018/6/6 20:37
 * description:
 */
public class PancakeHouseMenu {
    List<MenuItem> menuItems;

    public PancakeHouseMenu() {
        menuItems = new ArrayList<>();
    }

    public void addItem(String name, String description, boolean vegetarian, double
            price) {
        menuItems.add(new MenuItem(name, description, vegetarian, price));
    }
}

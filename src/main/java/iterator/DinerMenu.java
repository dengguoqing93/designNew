package iterator;

import java.util.Arrays;
import java.util.Iterator;

/**
 * @author guoqing
 * @since ： 2018/6/6 20:31
 * description:
 */
public class DinerMenu {
    static final int MAX_ITEMS = 6;
    int numberOfItems = 0;
    MenuItem[] menuItems;

    public DinerMenu() {
        menuItems = new MenuItem[MAX_ITEMS];
    }

    public void addItem(String name, String description, boolean vegetarian, double
            price) {
        MenuItem menuItem = new MenuItem(name, description, vegetarian, price);
        if (numberOfItems >= MAX_ITEMS) {
            System.out.println("Sorry,Menu is full! Can't add item menu");
        } else {
            menuItems[numberOfItems++] = menuItem;
        }
    }

    public Iterator<MenuItem> createItertor(){
        return Arrays.asList(menuItems).iterator();
    }
}

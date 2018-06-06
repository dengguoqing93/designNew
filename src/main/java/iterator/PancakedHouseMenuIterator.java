package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

/**
 * @author guoqing
 * @since ： 2018/6/6 20:28
 * description:
 */
public class PancakedHouseMenuIterator implements Iterator<MenuItem> {
    List<MenuItem> menuItems = new ArrayList<>();
    int position = 0;

    public PancakedHouseMenuIterator(List<MenuItem> menuItems) {
        this.menuItems = menuItems;
    }

    @Override
    public boolean hasNext() {
        return !(position >= menuItems.size() || menuItems.get(position) == null);
    }

    @Override
    public MenuItem next() {
        return menuItems.get(position++);
    }

    @Override
    public void remove() throws UnsupportedOperationException {
        throw new UnsupportedOperationException();
    }

    @Override
    public void forEachRemaining(Consumer<? super MenuItem> action) throws
            UnsupportedOperationException {

    }
}

package iterator;

import java.util.Iterator;
import java.util.function.Consumer;

/**
 * @author guoqing
 * @since ： 2018/6/6 20:18
 * description:
 */
public class DinerMenuIterator implements Iterator<MenuItem> {
    MenuItem[] items;
    int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public boolean hasNext() {
        return !(position >= items.length || items[position] == null);
    }

    public MenuItem next() {
        MenuItem menuItem = items[position];
        position += 1;
        return menuItem;
    }

    public void remove() throws UnsupportedOperationException{
    }

    public void forEachRemaining(Consumer<? super MenuItem> action) throws
            UnsupportedOperationException {

    }

}

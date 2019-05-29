package decorator.zen;

/**
 * @author dengguoqing
 * @date 2019/5/29
 */
public class ConcreteDecorator extends Decorator {
    public ConcreteDecorator(Component component) {
        super(component);
    }

    @Override
    public void operator() {
        component.operator();
    }
}

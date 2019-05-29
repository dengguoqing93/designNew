package decorator.model;

/**
 * 抽象装饰者
 * @author dengguoqing
 * @date 2019/5/29
 */
public abstract class Decorator implements Component {
   protected Component component;

    public Decorator(Component component) {
        this.component = component;
    }
}

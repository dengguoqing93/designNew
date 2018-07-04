package mediator;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/20 20:37
 */
public abstract class Colleague {
    protected Mediator mediator;

    public Colleague(Mediator mediator) {
        this.mediator = mediator;
    }
}

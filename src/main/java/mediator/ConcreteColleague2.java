package mediator;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/20 20:40
 */
public class ConcreteColleague2 extends Colleague {

    public ConcreteColleague2(Mediator mediator) {
        super(mediator);
    }

    //自有方法
    public void selfMethods2() {
    }

    //依赖方法
    public void depMethod2() {
        super.mediator.doSometing2();
    }
}

package mediator;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/20 20:36
 */
public class ConcreteMediator extends Mediator {
    @Override
    public void doSometing1() {
        super.c1.selfMethods1();
        super.c2.selfMethods2();
    }

    @Override
    public void doSometing2() {
        super.c1.selfMethods1();
        super.c2.selfMethods2();
    }
}

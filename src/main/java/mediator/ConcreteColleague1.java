package mediator;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/20 20:38
 */
public class ConcreteColleague1 extends Colleague {

    public ConcreteColleague1(Mediator mediator) {
        super(mediator);
    }

    //自有方法
    public void selfMethods1() {

    }

    //依赖方法
    public void depMethod1(){
        super.mediator.doSometing1();
    }
}

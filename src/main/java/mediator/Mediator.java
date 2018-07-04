package mediator;

/**
 * @author guoqing
 * @description : 通用抽象中介者
 * @since ： 2018/6/20 20:33
 */
public abstract class Mediator {
    protected ConcreteColleague1 c1;
    protected ConcreteColleague2 c2;

    public ConcreteColleague1 getC1() {
        return c1;
    }

    public void setC1(ConcreteColleague1 c1) {
        this.c1 = c1;
    }

    public ConcreteColleague2 getC2() {
        return c2;
    }

    public void setC2(ConcreteColleague2 c2) {
        this.c2 = c2;
    }
    //中介模式的业务逻辑
    public abstract void doSometing1();

    public abstract void doSometing2();
}

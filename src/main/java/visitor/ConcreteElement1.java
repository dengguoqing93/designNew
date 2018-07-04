package visitor;

/**
 * @author guoqing
 * @since ： 2018/7/3 19:32
 * ${var}
 */
public class ConcreteElement1 implements Element {
    @Override
    public void doSomething() {
        System.out.println("具体元素1");
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}

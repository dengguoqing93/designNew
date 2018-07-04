package visitor;

/**
 * @author guoqing
 * @since ： 2018/7/3 19:54
 */
public class VisitorImpl implements Visitor {
    @Override
    public void visit(Element element) {
        element.doSomething();
    }
}

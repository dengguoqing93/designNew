package decorator.zen;

/**
 * @author dengguoqing
 * @date 2019/5/29
 */
public class ConcreteComponent implements Component {
    @Override
    public void operator() {
        System.out.println("一个具体的组件");
    }
}

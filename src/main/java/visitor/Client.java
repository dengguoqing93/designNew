package visitor;

/**
 * @author guoqing
 * @since ： 2018/7/3 19:56
 */
public class Client {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            Element el = ObjectStructure.createElement();
            el.accept(new VisitorImpl());
        }
    }
}

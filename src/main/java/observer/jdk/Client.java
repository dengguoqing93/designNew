package observer.jdk;

/**
 * 测试类
 *
 * @author dengguoqing
 * @date 2019/5/27
 */
public class Client {


    public static void main(String[] args) {
        ProductList observable = ProductList.getInstance();
        TaoBaoObserver taoBaoObserver = new TaoBaoObserver();
        JIngDongServer jIngDongServer = new JIngDongServer();
        observable.addObserver(taoBaoObserver);
        observable.addObserver(jIngDongServer);
        observable.addProduct("新产品");
    }
}

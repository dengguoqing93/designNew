package observer.jdk;

import java.util.Observable;
import java.util.Observer;

/**
 * 京东电商接口
 *
 * @author dengguoqing
 * @date 2019/5/27
 */
public class JIngDongServer implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        String product = (String) arg;
        System.out.println("发送新产品【" + product + "】同步到京东商城");
    }
}

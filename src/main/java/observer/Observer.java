package observer;

/**
 * @author guoqing
 * @since ： 2018/5/24 21:43
 * description:
 */
public interface Observer {
    /**
     *
     * @param temp 气温
     * @param humidity 湿度
     * @param pressure 气压
     * @description 更新观察者数据
     */
    void update(float temp, float humidity, float pressure);
}

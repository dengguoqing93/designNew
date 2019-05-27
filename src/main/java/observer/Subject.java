package observer;

/**
 * @author guoqing
 * @since ： 2018/5/24 21:41
 * description:
 */
public interface Subject {
    /**
     * @param o 要加入观察者列表的观察者
     * @description 调用该方法时，观察者列表添加一个观察者
     */
    void registerObserver(Observer o);

    /**
     * @param observer 要被删除的观察者
     * @author guoqing
     * @description 从观察者列表删除观察者
     * @date 2018/5/24 21:52
     */
    void removeObserver(Observer observer);

    /**
     * @description 主题发生改变，通知观察者
     */
    void notifyObservers();
}

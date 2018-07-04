package visitor;

/**
 * @author guoqing
 * @since ： 2018/7/3 19:28
 * 访问者模式的抽象类
 */
public interface Element {
    /**
     * 定义业务逻辑
     */
    void doSomething();

    /**
     * 允许谁来访问
     * @param visitor 抽象访问者
     */
    void accept(Visitor visitor);


}

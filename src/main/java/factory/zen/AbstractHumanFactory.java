package factory;

/**
 * @author guoqing
 * @description : 创建人类的抽象工厂
 * @since ： 2018/6/18 9:29
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c);
}

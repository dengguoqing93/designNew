package factory;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/18 9:37
 */
public class HumanFactory extends AbstractHumanFactory {
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;
        try {
            human = (T)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
            System.out.println("人种生成错误");
        } catch (IllegalAccessException e) {
            e.printStackTrace();
            System.err.println("人种生成错误");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.err.println("人种生成错误");
        }
        return (T) human;
    }
}

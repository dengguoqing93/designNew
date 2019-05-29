package factory;

/**
 * @author guoqing
 * @description : 黄色人种实现类
 * @since ： 2018/6/17 22:17
 */
public class YellowHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黄色皮肤的人");
    }

    @Override
    public void talk() {
        System.out.println("使用双字节交流");
    }
}

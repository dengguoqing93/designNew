package factory.zen;

/**
 * @author guoqing
 * @description : 白色人种实现类
 * @since ： 2018/6/17 22:18
 */
public class WhiteHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("白色人种的皮肤是白色的");
    }

    @Override
    public void talk() {
        System.out.println("一般使用单字节交流");
    }
}

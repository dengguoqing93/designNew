package factory.zen;

/**
 * @author guoqing
 * @description : 黑色人种
 * @since ： 2018/6/17 22:15
 */
public class BlackHuman implements Human {
    @Override
    public void getColor() {
        System.out.println("黑色人种的皮肤是黑色的！");
    }

    @Override
    public void talk() {
        System.out.println("黑色人种说话比较模糊！");
    }
}

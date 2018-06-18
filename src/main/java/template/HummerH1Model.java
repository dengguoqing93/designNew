package template;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/18 14:58
 */
public class HummerH1Model implements HummerModel {
    @Override
    public void start() {
        System.out.println("汽车启动");
    }

    @Override
    public void stop() {
        System.out.println("汽车停止");
    }

    @Override
    public void alarm() {
        System.out.println("汽车鸣笛");
    }

    @Override
    public void engineBoon() {
        System.out.println("发动机运行");
    }
}

package template;

/**
 * @author guoqing
 * @description :模板方法模式
 * @since ： 2018/6/18 14:55
 */


public interface HummerModel {
    void start();

    void stop();

    void alarm();

    void engineBoon();

    default void run(){
        this.start();
        this.engineBoon();
        this.alarm();
        this.stop();
    }


}

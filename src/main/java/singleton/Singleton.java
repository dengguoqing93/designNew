package singleton;

/**
 * @author guoqing
 * @since ： 2018/6/4 18:35
 * description: 最简单单例模式实现(懒汉模式)
 */
public class Singleton {
    private static Singleton uniqueInstance;
    private Singleton(){
    }

    public static Singleton getInstance() {
        if (uniqueInstance==null){
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }
}

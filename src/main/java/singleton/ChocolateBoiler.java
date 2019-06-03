package singleton;

/**
 * @author guoqing
 * @since ： 2018/6/4 18:41
 * description:巧克力锅炉控制器：排除500加仑的未煮沸的混合物，或者锅炉已经满了还
 * 继续放原料，或者锅炉内还没放原料就开始空烧！
 */
public class ChocolateBoiler {
    private boolean empty;
    private boolean boiled;


    /**
     * 单例模式实现巧克力锅炉控制器
     */
    private volatile static ChocolateBoiler uniqueInstance;

    public static ChocolateBoiler getInstance() {
        if (uniqueInstance == null) {
            synchronized (Singleton.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new ChocolateBoiler(true, false);
                }
            }

        }
        return uniqueInstance;
    }


    private ChocolateBoiler(boolean empty, boolean boiled) {
        this.empty = empty;
        this.boiled = boiled;
    }

    /**
     * 在锅炉内填满巧克力和牛奶的混合物
     */
    public void fill() {
        if (isEmpty()) {
            empty = false;
            boiled = false;

        }
    }

    /**
     * 排出煮沸的巧克力和牛奶
     */
    public void drain() {
        if (!isEmpty() && isBoiled()) {
            empty = true;
        }
    }

    /**
     * 将炉内物煮沸
     */
    public void boil() {
        if (!isEmpty() && !isBoiled()) {
            boiled = true;
        }
    }

    private boolean isBoiled() {
        return boiled;
    }

    private boolean isEmpty() {
        return empty;
    }
}

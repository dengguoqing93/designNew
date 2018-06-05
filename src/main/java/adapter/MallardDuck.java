package adapter;

/**
 * @author guoqing
 * @since ： 2018/6/5 19:17
 * description:
 */
public class MallardDuck implements Duck {
    public void quack() {
        System.out.println("Quack");
    }

    public void fly() {
        System.out.println("I am flying");
    }
}

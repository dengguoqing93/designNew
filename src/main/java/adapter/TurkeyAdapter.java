package adapter;

/**
 * @author guoqing
 * @since ： 2018/6/5 19:23
 * description:
 */
public class TurkeyAdapter implements Duck {
    Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    public void quack() {
        turkey.gobble();
    }

    public void fly() {
        for (int i = 0;i<5;i++) {
            turkey.fly();
        }
    }
}

package adapter;

/**
 * @author guoqing
 * @since ： 2018/6/5 19:20
 * description:
 */
public class WildTurkey implements Turkey {
    public void gobble() {
        System.out.println("Gobble gobble");
    }

    public void fly() {
        System.out.println("I am flying a short distance");
    }
}

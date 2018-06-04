package primer.pojo;

import primer.impl.FlyNoWay;
import primer.impl.Quack;

/**
 * @author guoqing
 * @since ： 2018/5/23 21:42
 * description:
 */
public class ModelDuck extends Duck {
    public ModelDuck() {
        flyBehavior = new FlyNoWay();
        quackBehavior = new Quack();
    }

    public void display() {
        System.out.println("I'm a model duck");

    }

}

package primer.pojo;

import primer.FlyBehavior;
import primer.QuackBehavior;
import primer.impl.FlyWithWings;
import primer.impl.Quack;

/**
 * @author guoqing
 * @since ： 2018/5/23 21:33
 * description:
 */
public class MallardDuck extends Duck {

    public MallardDuck(){
        quackBehavior = new Quack();
        flyBehavior = new FlyWithWings();
    }

    @Override
    public void display() {
        System.out.println("I'm a real mallard duck!");
    }

}

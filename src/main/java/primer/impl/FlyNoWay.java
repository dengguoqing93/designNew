package primer.impl;

import primer.FlyBehavior;

/**
 * @author guoqing
 * @since ： 2018/5/23 21:26
 * description:
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly!!");
    }
}

package strategy;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/21 20:33
 */
public class StrategyImpl1 implements Strategy {
    @Override
    public void doSomething() {
        System.out.println("具体的策略1的运算法则");
    }
}

package strategy;

/**
 * @author guoqing
 * @description : 封装角色
 * @since ： 2018/6/21 20:34
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public void doAnything() {
        strategy.doSomething();
        
    }
}

package state;

/**
 * @author guoqing
 * @since ： 2018/6/7 20:05
 * description:
 */
public interface State {
    void insertQuarter();

    void ejectQuarter();

    void turnCrank();

    void dispense();
}

package dip;

/**
 * @author guoqing
 * @description : 司机实现类
 * @since ： 2018/6/14 20:01
 */
public class DriverImpl implements Driver {
    @Override
    public void driver(Car car) {
        car.run();
    }
}

package dip;

/**
 * @author guoqing
 * @description : 业务场景
 * @since ： 2018/6/14 20:01
 */
public class Client {
    public static void main(String[] args){
        Driver driver = new DriverImpl();
        Car benz = new BenzCarImp();
        driver.driver(benz);

    }
}

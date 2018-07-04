package visitor;

import java.util.Random;

/**
 * @author guoqing
 * @since ： 2018/7/3 19:55
 */
public class ObjectStructure {

    public static Element createElement(){
        Random random = new Random();
        if (random.nextInt(100) > 50) {
            return new ConcreteElement1();
        }else {
            return new ConcreteElement2();
        }
    }
}

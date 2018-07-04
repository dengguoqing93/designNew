package composite;

/**
 * @author guoqing
 * @description :叶子构件的实现
 * @since ： 2018/6/25 20:21
 */
public class Leaf extends Component {


    @Override
    public void doSomething() {
        System.out.println("叶子构件实现的方法！");
    }
}

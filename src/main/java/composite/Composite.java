package composite;

import java.util.ArrayList;
import java.util.List;

/**
 * @author guoqing
 * @description : 树枝构件
 * @since ： 2018/6/25 20:15
 */
public class Composite extends Component {
    //构件容器
    private List<Component> components = new ArrayList<>();

    /**
     * @param component 构件
     * @description 为构件容器添加构件
     */
    public void add(Component component) {
        components.add(component);
    }

    /**
     * @param component 构件
     * @description 从构件容器中删除构件
     */
    public void remove(Component component) {
        components.remove(component);
    }

    public List<Component> getComponents() {
        return components;
    }

    @Override
    public void doSomething() {
        System.out.println("树枝构件实现的方法");
    }
}

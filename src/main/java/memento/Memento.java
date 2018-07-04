package memento;

/**
 * @author guoqing
 * @description : 备忘录角色
 * @since ： 2018/6/25 21:46
 */
public class Memento {
    //发起人的内部状态
    private String state;

    public Memento(String state) {
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}

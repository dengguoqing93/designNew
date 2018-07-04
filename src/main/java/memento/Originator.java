package memento;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/25 21:29
 */
public class Originator {
    //内部状态
    private String state = "";

    /**
     * 创建一个备忘录
     * @return 返回一个备忘录
     */
    public Memento createMemento() {
        return new Memento(this.state);
    }

    public void restoreMemento(Memento memento) {
        setState(memento.getState());

    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }


}

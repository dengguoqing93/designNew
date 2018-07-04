package memento;

/**
 * @author guoqing
 * @description : 备忘录管理员角色
 * @since ： 2018/6/25 21:50
 */
public class Caretaker {
    //备忘录对象
    private Memento memento;

    public Memento getMemento() {
        return memento;
    }

    public void setMemento(Memento memento) {
        this.memento = memento;
    }
}

package lsp;

/**
 * @author guoqing
 * @since ： 2018/6/14 19:18
 * description:士兵的实现类
 */
public class Solider {
    private AbstractGun gun;

    public void setGun(AbstractGun gun) {
        this.gun = gun;
    }

    public void killEnemy() {
        System.out.println("士兵开始杀敌人");
        gun.shoot();
    }
}

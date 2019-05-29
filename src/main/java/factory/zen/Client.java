package factory.zen;

/**
 * @author guoqing
 * @description :
 * @since ： 2018/6/18 9:42
 */
public class Client {
    public static void main(String[] args){
        AbstractHumanFactory factory = new HumanFactory();
        System.out.println("--造出的第一人是白色人种--");
        Human whiteHuman = factory.createHuman(WhiteHuman.class);
        whiteHuman.getColor();
        whiteHuman.talk();
        System.out.println("--造出的第二批人是黑色人种--");
        Human blackHuman = factory.createHuman(BlackHuman.class);
        blackHuman.getColor();
        blackHuman.talk();
        System.out.println("造出的第三批人是黄色人种");
        Human yellowHuman = factory.createHuman(YellowHuman.class);
        yellowHuman.getColor();
        yellowHuman.talk();
    }
}

package singleton.hungry;

/**
 * @author wuxiaoming
 * @date 2018-03-07 10:22
 */

/**
 * 饿汉模式（无法向单例对象的构造方法传参）
 */
public class Singleton {
    private static final Singleton instance = new Singleton();

    private Singleton(){}

    public static Singleton getInstance(){
        return instance;
    }
}

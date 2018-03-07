package singleton.lazy;

/**
 * @author wuxiaoming
 * @date 2018-03-07 11:08
 */

/**
 * 懒汉模式（可以向构造方法传参）
 */
public class Singleton {
    private static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}

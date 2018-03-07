package singleton.innerclass;

/**
 * @author wuxiaoming
 * @date 2018-03-07 11:12
 */

/**
 * 静态内部类
 * 可以延时加载，也能线程安全
 */
public class Singleton {
    private Singleton(){

    }

    private static class SingletonHolder{
        private static Singleton instance = new Singleton();
    }

    public static Singleton getInstance(){
        return SingletonHolder.instance;
    }
}

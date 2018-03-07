package singleton.doublecheck;

/**
 * @author wuxiaoming
 * @date 2018-03-07 10:32
 */

/**
 * 双层检测
 * 线程并发时，当变量杯盖币安了，所有的线程都能即时访问到最新的数据
 * 会屏蔽掉虚拟机的一些代码优化
 */
public  class Singleton {
    private volatile static Singleton instance;
    private Singleton(){

    }
    public static Singleton getInstance(){
        if (instance == null) {
            synchronized (Singleton.class){
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}

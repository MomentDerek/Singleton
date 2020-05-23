/**
 * @Description: 懒汉式单例的双重检查锁版本
 * @Author: Moment
 * @Date: 2020/5/22 23:10
 */
public class LazyDoubleCheckSingleton {

    private LazyDoubleCheckSingleton(){}

    //volatile是必须的，用于确保lazy不被指令重排
    private volatile static LazyDoubleCheckSingleton lazy = null;

    public static LazyDoubleCheckSingleton getInstance() {
        //除非线程同时调用创建，否则会被第一个if拦截住，不会因为同步锁影响效率
        if (lazy == null) {
            synchronized (LazyDoubleCheckSingleton.class) {
                if (lazy == null) {
                    lazy = new LazyDoubleCheckSingleton();
                }
            }
        }
        return lazy;
    }
}

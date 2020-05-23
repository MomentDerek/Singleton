/**
 * @Description: 懒汉式单例的原始版本
 * @Author: Moment
 * @Date: 2020/5/22 23:10
 */
public class LazySimpleSingleton {

    private LazySimpleSingleton(){}

    private static LazySimpleSingleton lazy = null;

    public synchronized static LazySimpleSingleton getInstance() {
        if (lazy == null) {
            lazy = new LazySimpleSingleton();
        }
        return lazy;
    }
}

/**
 * @Description: 饿汉式单例
 * @Author: Moment
 * @Date: 2020/5/22 10:23
 */
public class HungrySingleton {
    //饿汉式唯一的缺点就是在类加载的时候就会初始化，
    //无论用还是不用都会占用内存
    //适用于单例对象比较少的情况（书本原话）
    //应该用在最重要的地方，其他地方最好别用（个人理解）

    //赋值的过程也可以扔到静态块里面
    private static final HungrySingleton HUNGRY_SINGLETON = new HungrySingleton();

    private HungrySingleton() {
    }

    public static HungrySingleton getInstance() {
        return HUNGRY_SINGLETON;
    }
}

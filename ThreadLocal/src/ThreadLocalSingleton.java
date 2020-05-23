/**
 * Description:
 * 线程单例实现
 * Date: 2020/5/23 10:55
 *
 * @author Moment
 */
public class ThreadLocalSingleton {
    private static final ThreadLocal<ThreadLocalSingleton> threadLocalInstance =
            ThreadLocal.withInitial(() -> new ThreadLocalSingleton());

    private ThreadLocalSingleton(){}

    public static ThreadLocalSingleton getInstance() {
        return threadLocalInstance.get();
    }
}

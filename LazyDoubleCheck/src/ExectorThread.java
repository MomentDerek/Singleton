/**
 * @Description: TODO
 * @Author: Moment
 * @Date: 2020/5/22 23:23
 */
public class ExectorThread implements Runnable {
    @Override
    public void run() {
        LazyDoubleCheckSingleton singleton = LazyDoubleCheckSingleton.getInstance();
        System.out.println(Thread.currentThread().getName()+":"+singleton);
    }
}

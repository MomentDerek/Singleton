/**
 * @Description: TODO
 * @Author: Moment
 * @Date: 2020/5/22 23:25
 */
public class LazyDoubleCheckSingletonTest {
    public static void main(String[] args) {
        Thread t1 = new Thread(new ExectorThread());
        Thread t2 = new Thread(new ExectorThread());
        t1.start();
        t2.start();
        System.out.println("end");
    }
}

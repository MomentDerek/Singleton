/**
 * @Description: 测试饿汉式单例
 * @Author: Moment
 * @Date: 2020/5/22 10:34
 */
public class HungrySingletonTest {
    public static void main(String[] args) {
        HungrySingleton hungrySingleton1 = HungrySingleton.getInstance();
        HungrySingleton hungrySingleton2 = HungrySingleton.getInstance();
        System.out.println("hungrySingleton1:"+hungrySingleton1);
        System.out.println("hungrySingleton2:"+hungrySingleton2);
    }
}

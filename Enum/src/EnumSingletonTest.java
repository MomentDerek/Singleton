/**
 * Description:
 * TODO
 * Date: 2020/5/23 10:39
 *
 * @author Moment
 */
public class EnumSingletonTest {
    public static void main(String[] args) {
        EnumSingleton singleton1 = EnumSingleton.getInstance();
        EnumSingleton singleton2 = EnumSingleton.getInstance();

        singleton1.setWtf("wtf2");
        System.out.println(singleton2.getWtf());
    }
}

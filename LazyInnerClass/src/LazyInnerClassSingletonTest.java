import java.lang.reflect.Constructor;

/**
 * Description:
 * TODO
 * Date: 2020/5/23 9:45
 *
 * @author Moment
 */
public class LazyInnerClassSingletonTest {
    public static void main(String[] args) {

        try {
            Class<?> clazz = LazyInnerClassSingleton.class;

            Constructor constructor = clazz.getDeclaredConstructor(null);
            constructor.setAccessible(true);

            Object o1 = constructor.newInstance();
            Object o2 = constructor.newInstance();

            System.out.println(o1 == o2);

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}

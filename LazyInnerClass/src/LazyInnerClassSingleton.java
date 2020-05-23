/**
 * 使用内部类实现懒汉式单例
 * @author Moment
 */
public class LazyInnerClassSingleton {

    private LazyInnerClassSingleton(){
        if (LazyHolder.LAZY != null) {
            throw new RuntimeException("不允许创建多个实例");
        }
    }

    //此处不需要final
    //static 保证对静态内部类的访问，同时保证该方法不会被重载，重写
    public static LazyInnerClassSingleton getInstance() {
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
        private static final LazyInnerClassSingleton LAZY = new LazyInnerClassSingleton();
    }

}

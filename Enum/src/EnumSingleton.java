/**
 * Description:
 * TODO
 * Date: 2020/5/23 10:18
 *
 * @author Moment
 */
public enum  EnumSingleton {
    ENUM_SINGLETON_TAG;
    private String wtf = "wtf";

    public String getWtf() {
        return wtf;
    }

    public void setWtf(String wtf) {
        this.wtf = wtf;
    }

    public static EnumSingleton getInstance() {
        return ENUM_SINGLETON_TAG;
    }
}

package handwritten;
/*
双重校验单例模式（DCL）
 */
public class Singleton2 {
    private volatile static Singleton2 singleton2;
    private Singleton2(){}
    public static  Singleton2 getSingleton2(){
        if (singleton2==null){
            synchronized (Singleton2.class){
                if (singleton2==null){
                    singleton2=new Singleton2();
                }
            }
        }
        return singleton2;
    }
}

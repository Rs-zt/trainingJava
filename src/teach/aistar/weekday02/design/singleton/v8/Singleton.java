package teach.aistar.weekday02.design.singleton.v8;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 17:29
 */
public class Singleton {
    //1.私有构造
    private Singleton(){
        System.out.println("构造");
    }
    //2.静态内部的枚举类型-省略了关键字static
    public enum SingletonEnum{
        INSTANCE;
        private Singleton instance=null;
        SingletonEnum(){
            instance=new Singleton();
        }
       public Singleton getInstance(){
            return instance;
       }
    }
}
class SingletonTest{
    public static void main(String[] args) {
        Singleton.SingletonEnum instance = Singleton.SingletonEnum.INSTANCE;
        Singleton.SingletonEnum instance2 = Singleton.SingletonEnum.INSTANCE;
        System.out.println(instance==instance2);
    }
}

package teach.aistar.weekday02.design.singleton.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 13:10
 * 饿汉模式
 */
public class Singleton {

        //提供这个类的唯一静态实例
        //只会赋值一次
        //饿汉式-加载Singleton类的时候,instance实例就会立即分配空间和初始化
        //线程安全-累的加载的时候,就会对instance初始化-这个时候线程压根还不存在
        private static Singleton instance =new Singleton();

        //私有化构造
    private Singleton(){
        System.out.println("构造块");
    }
    //提供一个公开的静态的方法来返回这个唯一的实例
    public static Singleton getInstance(){
        return instance;
    }

}
class Test{
    public static void main(String[] args) {
        //获取它的实例
        Singleton instance = Singleton.getInstance();
        Singleton instance1 = Singleton.getInstance();
        System.out.println(instance1==instance);
    }
}
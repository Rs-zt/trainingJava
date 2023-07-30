package teach.aistar.weekday02.design.singleton.v2;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 14:23
 * 懒汉模式
 */
public class Singleton {
    //懒汉模式-加载Singleton的时候,并没有立即将类的实例赋值给instance
    private static Singleton instance=null;
    public Singleton(){
        System.out.println("构造块");

    }
    //懒汉模式-谁先调用getInstance,南无才会对instance进行初始化赋值
    //为甚麽存在多线程不安全--是因为多个线程会同时调用getInstance
    //什么时候用什么时候初始化并且只有一次初始化
    public static Singleton getInstance(){
        return instance==null?instance=new Singleton():instance;
    }


}
class test{
    public static void main(String[] args) {
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//        System.out.println(s1==s2);
        //模拟多线程
        for (int i = 0; i < 100; i++) {
            Thread thread = new Thread(()->{
                Singleton s1 = Singleton.getInstance();
            });
            thread.start();

        }
    }
}
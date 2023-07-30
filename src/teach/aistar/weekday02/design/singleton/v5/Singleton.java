package teach.aistar.weekday02.design.singleton.v5;

import teach.aistar.day09.design.Single;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 19:57
 */
public class Singleton {
    //懒汉模式-加载Singleton的时候,并没有立即将类的实体赋值给instance
    private static volatile Singleton instance=null;
    public Singleton(){
        System.out.println("构造块...");
    }
    public static Singleton getInstance(){
        //创建对象的标准的流程"自认为
        //①申请空间,②初始化,调用构造方法(是一个完整的对象)③将对象在堆空间的内存地址赋值给引用变量
        //TODO....实际顺序,jvm会进行指令重排,重排的顺序①-③-②
        if (instance==null){
            //10个线程竞争资源
            synchronized (Singleton.class){
                if (instance==null){
                    //按照指令重排的顺序,第一个线程进入之后按照①-③,instance已经不在为null
                    //此时instance指向的哪个对象任然不是一个完整的对象,因为还没有来的及执行完整构造
                    instance=new Singleton();
                }
            }
            //抢到锁的线程会立即释放资源
        }
        return instance;
    }
}
class test{
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread t=new Thread(()->{
                Singleton s1=Singleton.getInstance();
            });
            t.start();
        }
    }
}

package teach.aistar.weekday02.design.singleton.v4;

import teach.aistar.weekday02.design.singleton.v3.Singeton;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 18:29
 */
public class Singleton {
    //懒加载-加载Singleton的时候,并没有立即将类的实例赋值给Instance
    private static Singleton instance=null;
    private Singleton(){
        System.out.println("构造块...");
    }
    public static Singleton getInstance(){
        //n个线程会同时进入,n个线程会同时判断instance=null;
        //假设n=100,假设10个跑的快的线程同时判断出来没instance=null
        //另外90个线程跑得慢
        //第一个判断的作用-让后面的线程不要再去强锁了,没有意义了
        if (instance==null){
            //跑的快的10个线程在这里强锁
            synchronized (Singleton.class){
                //谁第一个进来,判断为null
                //第二判断的作用-防止跑的快的线程会再次赋值
                if (instance==null){
                    //有第一个进入线程执行
                    instance=new Singleton();
                }
            }
        }
        return instance;
    }
}
class Singletontest{
    public static void main(String[] args) {
        for (int i = 0; i < 10000; i++) {
            Thread t=new Thread(()->{
                Singleton s=Singleton.getInstance();
            });
            t.start();
        }
    }
}
package teach.aistar.weekday02.design.singleton.v3;


/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 18:10
 */
public class Singeton {
    //懒汉模式-加载Singleton的时候,并立即将类的实例赋值给instance
    private static Singeton instance=null;
    private Singeton(){
        System.out.println("构造块");
    }
    //从1000个线程要想要进入getInstance方法内部执行的前提是哪个线程"抢到这个锁资源
    //哪个线程抢到,就由哪个线程去执行,其他没有抢到锁资源的线程就会等待阻塞
    //知道抢到锁的资源的线程执行完毕之后,-才会释放这把锁,其余线程才会继续抢锁
//加锁-释放锁-比较频繁的动作-比较耗时-性能不如饿汉模式
    public static synchronized Singeton getInstance(){
        return instance==null?instance=new Singeton():instance;
    }
}
class test{
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread t=new Thread(()->{
                Singeton s1=Singeton.getInstance();
            });
            t.start();
        }
    }
}

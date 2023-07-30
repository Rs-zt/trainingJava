package teach.aistar.weekday02.design.singleton.v2;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 14:32
 */
public class ThreadSafeDemo {
    //方法都是有线程去执行的
    //当我们自动程序的时候-启动是jvm.exe这个进程
    //当我们启动虚拟机这个进程之后,内部就会同时开启两个线程,不同的线程执行不同的任务
    //这两个线程分别是main线程-主线程-扶着执行main方法
    //另一个是gc线程-后台守护线程-负责回收垃圾对象
    public static void main(String[] args) throws InterruptedException {
        System.out.println("main-thread");
        ///获取当前线程的名称
        System.out.println(Thread.currentThread().getName());
        //自己创建一个线程,并且启动这个线程
        Thread t=new Thread(()->{
            System.out.println(Thread.currentThread().getThreadGroup());
        });
        t.start();
        Thread.sleep(10);
        System.out.println("main-exit");
    }
}

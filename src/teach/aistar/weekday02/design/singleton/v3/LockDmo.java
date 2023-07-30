package teach.aistar.weekday02.design.singleton.v3;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 18:02
 */
public class LockDmo {
    public synchronized void test()  {
        System.out.println(Thread.currentThread().getName()+":enter");
        //故意嘚瑟一会
        //线程从运行态->阻塞态
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        //阻塞态->睡眠时间一到->就绪态->等待CPU调度->运行态
        System.out.println(Thread.currentThread().getName()+":leave");
    }

    public static void main(String[] args) {
        LockDmo d = new LockDmo();
        Thread t1=new Thread(()->{
            d.test();
        });
        Thread t2=new Thread(()->{
            d.test();
        });
        //告诉jvm,我要启动线程.....线程由CPU调度
        t1.start();
        t2.start();
    }
}

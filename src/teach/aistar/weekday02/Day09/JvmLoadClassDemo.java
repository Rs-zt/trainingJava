package teach.aistar.weekday02.Day09;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 13:42
 */
public class JvmLoadClassDemo {
    //静态属性
    private static int guid=100;
    //非静态属性
    private int id=10;
    //静态属性
    static {
        System.out.println("允许访问guid"+guid);
//        System.out.println("不允许访问id"+id);
        System.out.println("我是静态代码块,只执行一次!加载类之后就会立即执行");
    }
    //但是普通代码块执行时机会高于构造块
    //普通代码块-每次new对象的时候,都会执行普通代码块
    //程序中很少写普通代码块,都会迁移到构造快中
    {
//        System.out.println("允许访问id"+id);
        System.out.println("我是普通代码快");
    }
    //每次new对象的时候,都会执行构造块
    public JvmLoadClassDemo(){
        System.out.println("构造块");
    }

    public static void main(String[] args) {
        JvmLoadClassDemo s1 = new JvmLoadClassDemo();
        JvmLoadClassDemo s2 = new JvmLoadClassDemo();
    }

}

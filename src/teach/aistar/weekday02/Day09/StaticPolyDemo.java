package teach.aistar.weekday02.Day09;

/**
 * @author 任胜
 * @version 1.0
 * 静态方法中不存在多态
 * @data 2023/7/29 14:07
 */
public class StaticPolyDemo {
    public static void main(String[] args) {
        Sup sub = new Sub();
        //也是可以使用对象调用static方法
        sub.test();
        //属性没有重写的概念-拿到的就是父类中的实例变量-成员变量
        System.out.println(((Sub) sub).b);
    }


}
class Sup{
    public int i=10;
    public static void test(){
        System.out.println("Sup...");
    }
}
class Sub extends Sup{
    public int b=20;
    //但是static修饰的方法不允许重写-静态方法不允许重写
    public static void test(){
        System.out.println("Sub..");
    }
}

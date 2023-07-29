package teach.aistar.day10.impents;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 11:16
 */
public interface IUserDao {
    //接口中的属性都是公开的的静态的常量属性
//    public static final int day=1;
    //简化
    int day1=1;
    //java8之前的说法-java 中的方法都是抽象方法-必须是-public
//    public abstract void changge();
    //简写
//    public void changge1();
    void changge();
    void find();
    //接口中不允许构造
    //省略了public
    default void test(){
        System.out.println("test....");
    }
    //允许提供静态方法
    static void testStatic(){
        System.out.println("Static");
    }
    //私有方法-jdk9.0-接口内部使用
    private void testPri(){
        System.out.println("私有方法...");
    }
}

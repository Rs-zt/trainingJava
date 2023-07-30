package teach.aistar.weekday02.day10.interfaces;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 12:48
 */
public interface IUserDao {
    //接口中的属性都是公开的静态属性的常量属性
    public static final int day=1;
    //简化
    public int Day=1;
    //最简洁
    int DAU=1;
    //jdk8之前说法是-java中的方法否是抽象方法-必须是public
    public abstract void changge();
    //简写
    public void change();
    //最精简
    void cheng();
    void find();
    //接口中不能提供构造
    //jdk8开始可以使用defalut关键字来定义普通方法
    default void test(){
        System.out.println("test....");

    }
    //允许提供静态方法
    static void testStatic(){
        System.out.println("statictest////");

    }
    ////私有方法-jdk9-接口内部使用
    private void testPri(){
        System.out.println("私有方法.....");
    }
}

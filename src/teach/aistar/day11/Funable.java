package teach.aistar.day11;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 15:16
 */
@FunctionalInterface
public interface Funable {
    //void test();

    int add(int a,int b);

    //允许出现普通方法
    //default void test01(){};
}

package teach.aistar.weekday02.Day09;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 13:39
 */
public class FinalDemo {
    //final修饰的属性,一旦赋值不能改变,定义的时候一定要赋值
    public final int Day=1;
    public static final int year=1;
    public static final int month;
    //通过静态代码块赋值
    static {
        month=1;
    }

}

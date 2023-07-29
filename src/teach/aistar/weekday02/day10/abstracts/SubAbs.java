package teach.aistar.weekday02.day10.abstracts;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 14:26
 * 抽象子类
 */
public abstract class SubAbs extends SupAbstract{
    //虽然不需要强制重写抽象父类中的抽象方法
    //但是还是可以手动重写chouxiangfangf


    @Override
    public double area() {
        return 20.9;
    }
}
class Sub extends SubAbs{

    @Override
    public double grith() {
        return 30.8;
    }
}

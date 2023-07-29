package teach.aistar.weekday02.day10.abstracts;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 14:22
 */
public abstract class SupAbstract {
    //可以有普通属性和普通方法
    private String sign;
    public String getSign(){
        return sign;
    }
    //允许有构造
    public SupAbstract(){

    }
    //抽象方法
    public abstract double area();
    public abstract double grith();
}

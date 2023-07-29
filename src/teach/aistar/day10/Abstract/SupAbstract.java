package teach.aistar.day10.Abstract;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 9:45
 */
public abstract class SupAbstract {
    private int a;
    private String str;

    public SupAbstract(){
        System.out.println("允许构造");
    }

    public SupAbstract(int a, String str) {
        this.a = a;
        this.str = str;
    }



    public abstract double area();
    public abstract double grith();
}

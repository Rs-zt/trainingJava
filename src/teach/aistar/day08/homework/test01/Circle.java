package teach.aistar.day08.homework.test01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 16:41
 * 子类Circle => 定义半径,3.14 => 重写area,girth
 */
public class Circle extends Shape{
    private double r;

    public Circle() {
    }

    public Circle(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }
    public double area(){
        return 3.14*r*r ;
    }
    public double girth(){
        return 3.14*r*2;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Circle");
        return sb.toString();
    }
}

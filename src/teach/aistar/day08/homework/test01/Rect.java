package teach.aistar.day08.homework.test01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 16:43
 * 子类Rect => len,width => 重写area,girth
 */
public class Rect extends Shape{
    private double len;
    private double width;

    public Rect() {
    }

    public Rect(double len, double width) {
        this.len = len;
        this.width = width;
    }


    public double getLen() {
        return len;
    }

    public void setLen(double len) {
        this.len = len;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }
    public double area(){
        return len*width;
    }
    public double girth(){
        return ((len+width)*2);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rect");
        return sb.toString();
    }
}

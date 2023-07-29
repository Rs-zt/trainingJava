package teach.aistar.day08.homework.test01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 16:40
 * Shape形状类 => area girth
 *
 * 子类Circle => 定义半径,3.14 => 重写area,girth
 *
 * 子类Rect => len,width => 重写area,girth
 * public Rect(int len,int width){
 *
 * }
 *
 * 子类Square √
 * public Square(int len){
 *   super(len,len);
 * }
 *
 * //测试 定义形状数组 - 遍历数组 - 打印周长和面积
 */
public class Shape{
    public double area(){
        return 0.0;
    }
    public double girth(){
        return 0.0;
    }

}

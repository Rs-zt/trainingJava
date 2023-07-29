package teach.aistar.day08.homework.test01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 16:51
 * 测试 定义形状数组 - 遍历数组 - 打印周长和面积
 */
public class ShapeTest {
    public static void main(String[] args) {
        Shape circle = new Circle(4);
        Shape rect = new Rect(8,4);
        Shape square = new Square(5);
        Shape[] shapes=new Shape[3];
        shapes[0]=circle;
        shapes[1]=rect;
        shapes[2]=square;
        for (int i = 0; i < shapes.length; i++) {
            System.out.println(shapes[i]+"面积"+shapes[i].area());
            System.out.println(shapes[i]+"周长"+shapes[i].girth());
        }
    }
}

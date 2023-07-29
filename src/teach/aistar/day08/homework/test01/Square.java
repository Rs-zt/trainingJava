package teach.aistar.day08.homework.test01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 16:45
 * 子类Square √
 *  * public Square(int len){
 *  *   super(len,len);
 *  * }
 */
public class Square extends Rect{
    public Square() {
    }
    public Square(int len){
        super(len,len);
    }
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Square");
        return sb.toString();
    }

}

package teach.aistar.weekday03.day11;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 19:14
 */
public class CloneTest {
    public static void main(String[] args) {
        Book b1 = new Book(1, "1002", "西游记", 100.0d);
        BookInfo bookInfo = new BookInfo(1, "abc");
        b1.setBookInfo(bookInfo);

        try {
            //clone不会走构造-直接在内存进行复制
            Book copy = (Book)b1.clone();
            //修改源对象
            //修改原对象的基本数据类型,String,Date类型都不会影响到副本
            b1.setId(2);
            b1.setIsbn("1002");
            //修改对象类型
            b1.getBookInfo().setId(1000);
            System.out.println(copy);
            System.out.println(copy.getBookInfo());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

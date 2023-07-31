package teach.aistar.day11;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 15:15
 */
public class CloneDemoTest {
    public static void main(String[] args) {
        Book b3 = new Book(1,"1001","西游记",100.0d,"神话小说",new Date());
        BookInfo info1 = new BookInfo(1,"abc");
        b3.setBookInfo(info1);

        //浅拷贝的特点
        //1. 修改原对象的基本数据类型,String,Date类型都不会对副本对象产生影响
        //2. 修改对象类型,会对副本对象造成影响
        try {
            //被克隆的对象一定要实现java.lang.Cloneable接口

            //为什么使用克隆,不去自己new
            //clone是不会走构造方法 - 直接在内存进行复制的.
            Book copy = (Book) b3.clone();

            //TODO... 修改原对象
            b3.setId(2);//修改的是基本类型
            b3.setIsbn("1002");//

            //修改对象类型
            b3.getBookInfo().setId(100);

            //TODO... 观察副本对象
            System.out.println(copy);
            System.out.println(copy.getBookInfo());
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }
}

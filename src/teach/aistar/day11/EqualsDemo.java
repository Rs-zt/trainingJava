package teach.aistar.day11;

import java.util.Objects;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 15:16
 */
public class EqualsDemo {
    public static void main(String[] args) {
        //一个类无论被实例化多少次,它在jvm内存中的那个Class实例
        Book b1 = new Book(1,"1001","西游记",100.0d);
        Book b2 = new Book(1,"1001","红楼梦",200.0d);

        // System.out.println(b1.getClass() == b2.getClass());//true

        //System.out.println(b1 == b2);//false

        //Object-equals方法 - 底层仍然是==
        //System.out.println(b1.equals(b2));

        //实际业务是需要根据对象的属性值的比较来决定是true/false
        //比如  规则:只要id一样,就认为是同一个对象,或者id以及isbn一样的时候,才认为是同一个对象.
        //重写equals

        //System.out.println(b1.equals(b1));

        //比较规则,当且仅当book的id以及bookInfo的id俩者高度保持一致的时候,才认为是同一个对象.
        Book b3 = new Book(1,"1001","西游记",100.0d);

        BookInfo info1 = new BookInfo(1,"abc");
        b3.setBookInfo(info1);

        Book b4 = new Book(1,"1002","红楼梦",200.0d);

        BookInfo info2 = new BookInfo(1,"def");
        b4.setBookInfo(info2);

        System.out.println(b3.equals(b4));

        System.out.println(Objects.equals("abc","abc"));

    }
}

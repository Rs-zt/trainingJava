package teach.aistar.weekday03.day11;

import java.util.Objects;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 18:59
 */
public class Equalstest {
    public static void main(String[] args) {
        Book b1 = new Book(1, "1001", "红楼梦", 1000);
        Book b2 = new Book(1, "1001", "红楼梦", 1000);
//        System.out.println(b1==b2);//fasle
//        System.out.println(b1.getClass()==b2.getClass());//true
//        System.out.println(b1.equals(b2));//调用自己重写的equals
        System.out.println("===============");
        Book b3 = new Book(1, "1001", "红楼梦", 1000);
        Book b4 = new Book(1, "1001", "红楼梦", 1000);
        BookInfo info1 = new BookInfo(1, "abc");
        b3.setBookInfo(info1);
        BookInfo info2 = new BookInfo(1, "abc");
        b4.setBookInfo(info2);
        System.out.println(b3.equals(b4));
        System.out.println(Objects.equals("abc","abc"));

    }
}

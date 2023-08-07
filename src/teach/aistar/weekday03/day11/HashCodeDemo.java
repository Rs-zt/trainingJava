package teach.aistar.weekday03.day11;

import java.util.HashSet;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 21:47
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        BookInfo info1 = new BookInfo(1,"abc");
        BookInfo info2 = new BookInfo(2,"def");
        BookInfo info3 = new BookInfo(3,"def1");
        BookInfo info4 = new BookInfo(4,"def2");
        BookInfo info5 = new BookInfo(4,"abc3");
        //无序并且不可重复
        HashSet<BookInfo> sets = new HashSet<>();
        //1.只要将对象放入到Set容器中,优先调用对象的Hashcode方法,得到一个哈希值
        //2.如果这个哈希值在这之前出现过,说明这个哈希值对应的位置没有被占用
        //3.没有被占用,就直接将对象放入到这个位置
        //4.如果这个哈希值在这之前出现过,此时还不能说明就是一个对象
        //5.如果出现哈希碰撞,则会进一步调用equals方法,如果返回true,说明是同一个对象,则拒绝添加
        sets.add(info1);
        sets.add(info2);
        sets.add(info3);
        sets.add(info4);
        sets.add(info5);
        for (BookInfo set : sets) {
            System.out.println(set);
        }
    }
}

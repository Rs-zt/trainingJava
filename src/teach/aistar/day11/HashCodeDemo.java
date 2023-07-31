package teach.aistar.day11;

import java.util.HashSet;
import java.util.Set;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 15:18
 */
public class HashCodeDemo {
    public static void main(String[] args) {
        BookInfo info1 = new BookInfo(1,"abc");
        BookInfo info2 = new BookInfo(2,"def");
        BookInfo info3 = new BookInfo(3,"def1");
        BookInfo info4 = new BookInfo(4,"def2");
        BookInfo info5 = new BookInfo(4,"def3");

        Set<BookInfo> sets = new HashSet<>();

        //1. 只要将对象放入到set容器中,优先调用对象的hashCode方法,得到一个哈希值
        //2. 如果这个哈希值在这之前从来没有出现过,说明这个哈希值对应的位置没有被占用
        //3. 没有被占用,就直接将对象放入到这个位置
        //4. 如果这个哈希值在这之前曾经出现过,但是此时还不能够说明哈希冲突的俩个对象一定是同一个对象
        //5. 如果哈希冲突了,那么这个时候才需要进一步比较equals方法,如果返回true,说明是同一个对象,则拒绝添加
        sets.add(info1);
        sets.add(info2);
        sets.add(info3);
        sets.add(info4);
        sets.add(info5);

        for (BookInfo b : sets) {
            System.out.println(b);
        }
    }
}

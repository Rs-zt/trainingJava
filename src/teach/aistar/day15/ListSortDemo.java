package teach.aistar.day15;

import teach.aistar.day14.homework.Purcase;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 10:29
 */
public class ListSortDemo {
    public static void main(String[] args) {
        List<Purcase> list = new ArrayList<>();

        Purcase p1 = new Purcase("宝洁","洗手粉",18.5);
        Purcase p2 = new Purcase("联合利华","肥皂",4.5);
        Purcase p3 = new Purcase("宝洁","牙膏",32.5);
        Purcase p4 = new Purcase("宝洁","毛巾",14.5);
        Purcase p5 = new Purcase("洁利","洗面奶",26.0);
        Purcase p6 = new Purcase("好迪","洗发水",27.5);
        Purcase p7 = new Purcase("多芬","沐浴露",38.5);
        Purcase p8 = new Purcase("宝洁","洗洁精",3.4);

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);

//        list.sort(new Comparator<Purcase>() {
//            @Override
//            public int compare(Purcase o1, Purcase o2) {
//                return (int) (o1.getCost()-o2.getCost());
//            }
//        });

        list.sort((o1,o2)-> (int) (o1.getCost()-o2.getCost()));

        for (Purcase o : list) {
            System.out.println(o);
        }
    }
}

package teach.aistar.day14.homework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/3 16:25
 */
public class Test {
    public static void main(String[] args) {
        List<Purcase> list = new ArrayList<>();

        Purcase p1 = new Purcase("宝洁","洗手粉",18.5);
        Purcase p2 = new Purcase("联合利华","肥皂",4.5);
        Purcase p3 = new Purcase("宝洁","牙膏",32.5);
        Purcase p4 = new Purcase("宝洁","毛巾",14.5);
        Purcase p5 = new Purcase("洁利","洗面奶",26.0);
        Purcase p6 = new Purcase("好迪","洗发水",27.5);
        Purcase p7 = new Purcase("多芬","沐浴露",38.5);
        Purcase p8 = new Purcase("宝洁","洗洁精",3.4);//

        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
        list.add(p5);
        list.add(p6);
        list.add(p7);
        list.add(p8);

        HashMap<String, Double> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
           if (map.containsKey(list.get(i).getBrand())){
               map.put(list.get(i).getBrand(),(list.get(i).getCost()+map.get(list.get(i).getBrand())));
           }else {
               map.put(list.get(i).getBrand(),list.get(i).getCost());
           }
        }
//        map.entrySet().stream().sorted((k1,k2)->k1.getValue().compareTo(k2.getValue())).forEach(System.out::println);
//        map.entrySet().stream().sorted((k1,k2)->k1.getValue().compareTo(k2.getValue())).forEach(System.out::println);
        map.values().stream().sorted((k1, k2) -> k1.compareTo(k2));
        map.forEach((v,k)-> System.out.println(v+":"+k));
    }
}

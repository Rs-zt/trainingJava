package teach.aistar.day14.homework;

import java.util.*;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 9:39
 */
public class Test01 {
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

        countAndSort(list);
    }

    private static void countAndSort(List<Purcase> list) {
        //新建一个amp集合进行归类
        HashMap<String, List<Purcase>> maps = new HashMap<>();
        //遍历list
        for (Purcase p : list) {
            //获取品牌名
            String brand=p.getBrand();
            if (maps.containsKey(brand)){
                List<Purcase> oldList = maps.get(brand);
                oldList.add(p);
            }else {
                ArrayList<Purcase> valueList = new ArrayList<>();
                valueList.add(p);
                //添加到maps集合中
                maps.put(brand,valueList);
//                System.out.println(maps);
            }
        }
        //统计
        HashMap<String, Double> countMap = new HashMap<>();
        maps.forEach((k,v)->{
            double total=0;
            for (Purcase purcase : v) {
                total+= purcase.getCost();
            }
            countMap.put(k,total);
        });
        //排序
        ArrayList<Map.Entry<String,Double>> sortList = new ArrayList<>();
        //必须采用map的第二种迭代方式
        Set<Map.Entry<String, Double>> entries = countMap.entrySet();
        Iterator<Map.Entry<String, Double>> iterator = entries.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, Double> e = iterator.next();
            sortList.add(e);
        }

        sortList.sort((e1,e2)-> (int) (e2.getValue()-e1.getValue()));
        sortList.forEach(p-> System.out.println(p));
    }
}

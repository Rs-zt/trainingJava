package teach.aistar.day14;

import java.util.*;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/3 14:53
 */
public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1,"aaa");
        hashMap.put(2,"bbb");
        hashMap.put(3,"ccc");
        hashMap.put(3,"ddd");

        //获取map集合大小
        System.out.println(hashMap.size());
        //判断集合中的是否有key
        System.out.println(hashMap.containsKey(2));
        //判断集合中是否有value
        System.out.println(hashMap.containsValue("aaa"));
        //根据key获取value
        System.out.println(hashMap.get(1));
        //将hashmap集合中所有的value取出来,封装到一个collection中
        Collection<String> values = hashMap.values();
        System.out.println(values);
        //直接输出map
        System.out.println(hashMap);
        System.out.println("===手写map的迭代器方式====");
        Set<Integer> keySet = hashMap.keySet();
        //遍历set集合
        Iterator<Integer> iterator = keySet.iterator();
        while (iterator.hasNext()){
            Integer next = iterator.next();
            String s = hashMap.get(next);
            System.out.println(next+":"+s);
        }
        System.out.println("===map集合的第二种迭代器-====");
        Set<Map.Entry<Integer, String>> entrySet = hashMap.entrySet();
        Iterator<Map.Entry<Integer, String>> iterator1 = entrySet.iterator();
        while (iterator1.hasNext()){
            Map.Entry<Integer, String> entry = iterator1.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }
        System.out.println("jdk8.x=======");
      hashMap.forEach((k,v)-> System.out.println(k+":"+v));
    }
}

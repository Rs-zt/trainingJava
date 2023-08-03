package teach.aistar.day14;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/3 15:05
 */
public class HashMapEntryDemo {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1,"java");
        map.put(2,"mysql");
        map.put(3,"python");
        map.put(4,"C++");
        //将每个key和value封装到myEntry,然后这个myEntry对象封装一个Set集合中
        Set<MyEntry<Integer,String>> entrySet=myEntrySet(map);
        Iterator<MyEntry<Integer, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            MyEntry<Integer, String> entry = iterator.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+":"+value);
        }
    }

    private static Set<MyEntry<Integer, String>> myEntrySet(HashMap<Integer, String> map) {

        Set<MyEntry<Integer,String>> set = new HashSet<>();
        //将map集合转换成String
        String s=map.toString();
        System.out.println(s);
        //去除{}
        s=s.substring(1,s.length()-1);
        System.out.println(s);
        //根据,进行切割
        String[] arr=s.split(",");
        for (String s1 : arr) {
            s1=s1.trim();
            System.out.println(s1);
            //根据=进行切割
            String[] kvs=s1.split("=");
            //将每个key-value封装到MyEntry对象
            MyEntry<Integer, String> entry = new MyEntry<Integer, String>(Integer.valueOf(kvs[0]), kvs[1]);
            //将每个对象封装到Set集合中
            set.add(entry);
        }
        return set;
    }
}

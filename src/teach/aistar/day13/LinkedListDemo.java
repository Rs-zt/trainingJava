package teach.aistar.day13;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/2 15:59
 */
public class LinkedListDemo {
    public static void main(String[] args) {
//        LinkedList<String> list = new LinkedList<>();
//        long t=System.currentTimeMillis();
//        for (int i = 0; i < 10000000; i++) {
//            list.add("0");
//        }
//        System.out.println((System.currentTimeMillis()-t));
//
//        ArrayList<String> strings = new ArrayList<>();
//        long t=System.currentTimeMillis();
//        for (int i = 0; i < 10000000; i++) {
//            strings.add("0");
//        }
//        System.out.println((System.currentTimeMillis()-t));
        LinkedList<String> list = new LinkedList<>();
        list.add("java");
        list.add("java");
        list.add("java");
        list.add(1,"mysql");
        list.addFirst("python");
        list.addLast("c++");
        System.out.println(list.element());
        list.push("a");
        list.push("b");
        list.pop();
        list.removeFirst();
        list.removeLast();
//        list.remove(1);
        System.out.println(list);
        Iterator<String> iterator = list.iterator();
        while (iterator.hasNext()){
            String b= iterator.next();
            System.out.println(b);
        }
    }
}

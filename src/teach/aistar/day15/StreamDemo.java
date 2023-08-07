package teach.aistar.day15;

import java.util.ArrayList;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 12:12
 */
public class StreamDemo {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("admin");
        list.add("jack");
        list.add("kangkang");
        list.add("张三");
        list.add("李四");
        list.add("王二麻子");
        list.add("赵六");
        list.add("田七");
        list.add("王八");
        System.out.println(list.stream().count());//获取流的长度
    }
}

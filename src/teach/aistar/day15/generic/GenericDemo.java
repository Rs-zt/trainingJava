package teach.aistar.day15.generic;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 17:53
 */
public class GenericDemo {
    public static void main(String[] args) {
        List<?> list = new ArrayList<>();
        //只能存储null值
        list.add(null);
//        System.out.println(list.getClass());
//        list.add("ok");
//        list.add(12);
        ArrayList<Integer> li = new ArrayList<>();
        //获取运行对象的运行时类型-获取class实例
        li.add(12);
        li.add(20);
        //和泛型无是无关的,-泛型在运行期间将会被擦除,只有在编译期间有效
        System.out.println(li.getClass());
        List<Long> list1 = new ArrayList<>();
        list1.add(200L);
        list1.add(200L);
        System.out.println(list1.getClass());
        //一个类无论被实例化多少次,它在JVM中的class实例永远只有一个
        System.out.println(li.getClass()==list1.getClass());//true
        //编译会报错,泛型没有多态
//        List<Number> list2 = new ArrayList<Integer>();
        listAll(li);
        System.out.println("=====");
        listAll(list1);
    }

   public static void listAll(List<? extends Number>list){
       Iterator<? extends Number> iter=list.iterator();
       while (iter.hasNext()){
           Number n = iter.next();
           System.out.println(n);
       }
   }
}

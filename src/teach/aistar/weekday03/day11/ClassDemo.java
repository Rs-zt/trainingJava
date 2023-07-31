package teach.aistar.weekday03.day11;

import java.util.Objects;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 19:12
 */
public class ClassDemo {
    public static void main(String[] args) {
        Object o = new ClassDemo();
        Class<?> c1 = o.getClass();
        System.out.println(c1);
        System.out.println(c1.getName());
        System.out.println(c1.getSimpleName());
    }
}

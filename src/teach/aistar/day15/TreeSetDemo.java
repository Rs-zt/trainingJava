package teach.aistar.day15;

import java.util.TreeSet;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 14:05
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        PurcaseX p1 = new PurcaseX("aaa", 400.0d);
        PurcaseX p2= new PurcaseX("bbbb", 200.0d);
        PurcaseX p3 = new PurcaseX("cccc", 100.0d);
        PurcaseX p4 = new PurcaseX("ddd", 300.0d);
        PurcaseX p5 = new PurcaseX("aaa", 200.0d);
        //使用空参构造,需要实现java.lang.Cpmparable接口,否则会抛出类型转换异常
//        TreeSet<PurcaseX> set = new TreeSet<>();
        TreeSet<PurcaseX> set = new TreeSet<>(
                ((o1, o2) -> (int) (o1.getTotal()-o2.getTotal()))
        );
        set.add(p1);
        set.add(p2);
        set.add(p3);
        set.add(p4);
        set.add(p5);
        for (PurcaseX purcaseX : set) {
            System.out.println(purcaseX);
        }
    }
}

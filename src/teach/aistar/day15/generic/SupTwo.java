package teach.aistar.day15.generic;

import teach.aistar.day15.PurcaseX;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 18:32
 */
public class SupTwo {//普通类,个别方法是需要做成泛型方法的
    //泛型方法
    public <E> void add(E e){
        System.out.println(e.getClass());
    }
    public <E> E sub(E e){
        return e;
    }
    public static <E> E test(E e){
        return e;
    }
}
class test{
    public static void main(String[] args) {
        SupTwo s = new SupTwo();
        s.add(12);
        System.out.println(s.sub("ok"));
        System.out.println(SupTwo.test(new PurcaseX("aaa",100.0d)));
    }
}
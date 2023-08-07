package teach.aistar.day15.generic;

import teach.aistar.day15.PurcaseX;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 18:24
 */
public class Sup01<T> {
    public void add(T t){
        System.out.println(t);
    }
}
//子类不指定确定泛型
class Sub01<T> extends Sup01<T>{
    @Override
    public void add(T t) {
        System.out.println("Sub01-"+t);
    }
}
//子类指定确定的类型
class Sub02<PurcaseX> extends Sup01<PurcaseX>{
    @Override
    public void add(PurcaseX purcaseX) {
        System.out.println("sub02-"+purcaseX);
    }
}
class Supo1Test{
    public static void main(String[] args) {
        Sup01<String> s = new Sub01<>();
        s.add("ok");
        Sup01<PurcaseX> s2 = new Sub02<>();
        s2.add(new PurcaseX("saa",100.0d));
    }
}

package teach.aistar.weekday02.day10.extend;

import teach.aistar.day10.Abstract.Sub;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 15:09
 */
public class Sup {

}
class sub extends Sup implements IA{

    @Override
    public void a() {
        System.out.println("A()");
    }
}
class Test{
    public static void main(String[] args) {
        Sup s = new sub();
        IA sub = new sub();
        //s instanceof IA
        System.out.println(s instanceof IA);
        IA s2= (IA) s;
    }
}

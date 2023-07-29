package teach.aistar.weekday02.Day09;

import javax.swing.plaf.SpinnerUI;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 13:59
 * 静态内部类
 */
public class StaticOuter {
    private int id=10;
    private int sid=10;
    private static int guid=100;
    //静态内部类
    public static class StaticInner{
        private int id=10;
        private static int guid=20;
        public void test01(){
            //访问自己内部的属性
            System.out.println("inner-id"+id);
            System.out.println("inner-static_guid"+id);
            System.out.println("outer-static_id"+StaticOuter.guid);
            System.out.println("outer-id"+new StaticOuter().id);
        }
        public static void test02(){
            System.out.println("inner-guid"+guid);
            System.out.println("outer-guid"+StaticOuter.guid);
        }
    }
}
class Test{
    public static void main(String[] args) {
        //创建静态内部类对象
        StaticOuter.StaticInner staticInner = new StaticOuter.StaticInner();
        staticInner.test01();
    }
}

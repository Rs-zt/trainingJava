package teach.aistar.day16.EnumDemo;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 16:37
 * 枚举类型可以实现多个接口,并且也是要实现里面所有抽象方法
 */
public enum InterfaceEnumDemo implements IA,Ib{
    F;

    @Override
    public void add() {
        System.out.println("addd,....");
    }

    @Override
    public void add1() {
        System.out.println("IB-add....");
    }
}
interface IA{
    void add();
}
interface Ib{
    void add1();
}
class test{
    public static void main(String[] args) {
//        InterfaceEnumDemo[] a1=InterfaceEnumDemo.values();
//        for (InterfaceEnumDemo enumDemo : a1) {
//            enumDemo.add();
//            enumDemo.add1();
//        }
        InterfaceEnumDemo a1=InterfaceEnumDemo.F;
        a1.add();
        a1.add1();
    }
}
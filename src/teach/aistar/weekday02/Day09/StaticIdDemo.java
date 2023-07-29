package teach.aistar.weekday02.Day09;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 13:50
 * 静态属性分配空间和初始化的机会只有一次,并且是类一旦加载完毕,就立即分配
 */
public class StaticIdDemo {
    //普通属性-只要每次创建对象,就会对非静态属性分配空间和初始化
    private int id=1;
    //静态属性,一旦类加载之后,就会对静态属性分配空间和初始化,并且时机只有一次
    //静态属性在内存中永远就只有一份,和创建多少对象无关
    //静态属性是对象共享的
    private static int guid=10;
    public StaticIdDemo(){
        this.id=++guid;
    }
    public int getId(){
        return id;
    }

    public static void main(String[] args) {
        StaticIdDemo staticIdDemo = new StaticIdDemo();
        System.out.println(staticIdDemo.getId());

        StaticIdDemo staticIdDemo1 = new StaticIdDemo();
        System.out.println(staticIdDemo1.getId());

        StaticIdDemo staticIdDemo2 = new StaticIdDemo();
        System.out.println(staticIdDemo2.getId());
    }

}

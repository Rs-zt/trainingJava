package teach.aistar.day15.generic;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 18:13
 */
public class Sup<T>{//泛型类-很多方法都是属于泛型方法

    //泛型作为参数列表
    public void test(T t){
        System.out.println(t);
    }
    //泛型作为返回类型
    public T test1(T t){
        return t;
    }
    //静态方法,泛型只能加在方法上<T>
    public static <T> T test02(T e){
        return e;
    }
}
class SupTest{
    public static void main(String[] args) {
        Sup<String> sup = new Sup<>();
        sup.test("ok");
        System.out.println(sup.test1("fff"));
        System.out.println(Sup.test02(12));

    }
}

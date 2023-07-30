package teach.aistar.weekday02.principle;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 21:23
 * 里氏替换原则
 */
public class Sup {
    //TODO..父类的形参的范围比子类更加宽松
    public void test01(FatherSup fatherSup){
        System.out.println("Sup-test01...");
    }
    //里氏替换原则-子类的形参范围要比父类更加宽松
    public void test02(FatherSub fatherSub){
        System.out.println("Sup-test02...");
    }
}
class Sub extends Sup{
    //TODO... 父类的形参的范围比子类更加宽松
    public void test01(FatherSub fatherSub){
        System.out.println("Sub-test01...");
    }
    //尽量不要覆盖父类中已经实现了的方法.
    //子类的形参的范围要比父类的范围要更加宽松 - 凡是可以使用基类的地方,一定也是允许使用子类


    public void test02(FatherSup fatherSup){
        System.out.println("Sub-test02...");
    }
}
class FatherSup{

}
class FatherSub extends FatherSup{

}
class SupTest{
    public static void main(String[] args) {
        FatherSub fatherSub = new FatherSub();
        //使用父类
        Sup sup = new Sup();
        sup.test01(fatherSub);//Sup-test01...

        Sub sub = new Sub();
        sub.test01(fatherSub);//Sub-test01...
        //TODO... 俩个结果不一样 - 违背了里氏替换原则 - 凡是可以使用基类的地方,一定也是允许使用子类
        //一旦使用子类来替换父类 - 执行的结果是不一样的 - 不能够替换.

        System.out.println("====");

        sup.test02(fatherSub);//Sup-test02...
        sub.test02(fatherSub);//Sup-test02...
    }
}
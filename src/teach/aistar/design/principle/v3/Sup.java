package teach.aistar.design.principle.v3;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 14:32
 */
public class Sup {
    public void test01(FatherSup fatherSup){
        System.out.println("Sup-test01...");
    }
    public void test02(FatherSub fatherSub){
        System.out.println("Sup-test02...");
    }
}
class Sub extends Sup{
    public void test01(FatherSub fatherSub){
        System.out.println("Sub-test01...");
    }
    public void test02(FatherSup fatherSup){
        System.out.println("Sub-test02....");
    }
}
class FatherSup{

}
class FatherSub extends FatherSup{

}
class Test{
    public static void main(String[] args) {
        FatherSub fatherSub = new FatherSub();
        Sup sup = new Sup();
        sup.test01(fatherSub);
        Sub sub = new Sub();
        sub.test01(fatherSub);
        System.out.println("=======");
        sup.test02(fatherSub);
        sub.test02(fatherSub);
    }
}

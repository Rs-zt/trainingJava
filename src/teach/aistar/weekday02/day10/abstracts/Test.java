package teach.aistar.weekday02.day10.abstracts;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 14:29
 */
public class Test {
    public static void main(String[] args) {
        //多态-编译时写成父类,运行时类型写成子类
        SupAbstract sub01 = new Sub01();
        System.out.println(sub01.area());

        //因为SubAbs是一个抽象类-不能够被实例化
        //SupAbstract sonAb=new SubAbs();
        SubAbs subAbs = new Sub();
        System.out.println(subAbs.area());
        System.out.println(subAbs.grith());
        //场景:实现一个业务,就带定义一个子类-造成子类比较臃肿
        SupAbstract father=new SupAbstract() {
            @Override
            public double area() {

                return 80.0;
            }

            @Override
            public double grith() {
                return 80.9d;
            }
        };
        System.out.println(father.area());
        System.out.println("=========");
        System.out.println(new SupAbstract() {
            @Override
            public double area() {
                return 90.0d;
            }

            @Override
            public double grith() {
                return 80.0d;
            }
        }.area());
    }
}

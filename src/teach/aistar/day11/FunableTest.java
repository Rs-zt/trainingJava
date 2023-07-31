package teach.aistar.day11;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 15:17
 */
public class FunableTest {
    public static void main(String[] args) {
        //匿名内部类的写法
//        Funable f1 = new Funable() {
//            @Override
//            public void test() {
//                System.out.println("test...");
//            }
//        };

        //如果函数体中只能一行代码,{}是可以省略
        //Funable f2 = ()-> System.out.println("lambda...");

//        Funable f2 = ()->{
//                System.out.println("test...");
//            };
//        f2.test();

        //带有参数
        //一行代码中的return是需要不写的.
        Funable f3 = (m,n)-> m + n;
        System.out.println(f3.add(10,20));
    }
}

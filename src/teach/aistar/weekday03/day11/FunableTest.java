package teach.aistar.weekday03.day11;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 21:41
 */
public class FunableTest {
    public static void main(String[] args) {
        //匿名内部类的写法
//        Funable f1=new Funable() {
//            @Override
//            public int add(int a, int b) {
//                return a+b;
//            }
//        };
        //如果函数体中只能有一行代码,{}是可以省略的
        //一行代码中的retrun 不需要写
        Funable f2=(a,b)->a+b;
        System.out.println(f2.add(10,20));
//        Funable f3=(a,b)->{
//          return a+b ;
//        };
    }
}

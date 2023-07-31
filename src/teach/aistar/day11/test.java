package teach.aistar.day11;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 10:49
 */
public class test {
    public static void main(String[] args) {
        //   FuctionInterface f=new FuctionInterface() {
//       @Override
//       public int test(int a, int b) {
//           return a+b;
//       }
//   };
        //lamda表达式
//        FuctionInterface f1=()-> System.out.println("test.....");
//        f1.test();

//        FuctionInterface f1=()->{
//            System.out.println("test...");
//        };
        FuctionInterface f1=(m,n)->m+n;
        System.out.println(f1.add(10,20));
    }

}

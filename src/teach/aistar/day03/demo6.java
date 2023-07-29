package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 15:59
 */
public class demo6 {
    public static void main(String[] args) {
//        for (int i = 1,j=1; i <10 ; j++) {
//            System.out.print(i+"*"+j+"="+i*j+"\t");
//            if (i==j){
//                System.out.println();
//                i++;
//                j=0;
//
//            }
//
//        }
//        for (int i = 1; i <10 ; i++) {
//            for (int j = 1; j <=i ; ++j) {
//                System.out.print(i+"*"+j+"="+i*j+"\t");
//            }
//            System.out.println();
//
//        }
//        for (int i = 0; i < 9; i++) {
//            for (int j = 0; j < 9; j++) {
//                System.out.println("*");
//
//            }
//
//        }
        System.out.println(fib(8));

    }
    private static int fib(int n) {
        if (n == 1 || n == 2) return 1;
        int x = 1, y = 1;
        int num = 0;
        for (int i = 3; i <= n; i++) {
            num = x + y;
            x = y;
            y = num;
        }
        return num;
    }
}

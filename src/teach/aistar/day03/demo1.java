package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 9:42
 */
public class demo1 {
    public static void main(String[] args) {

        zixin(1234);
//        System.out.println(demo1.yanghui(4, 3));
//        demo1 a = new demo1();
//        System.out.println(a.test());

    }
//    public String test(){
//        return "rewjhd";
//    }
//    public static int test01(int n){
//       if (n==1){
//           return 1;
//       }
//       return n*test01(n-1);
//    }
//    public static int test02(int a,int b){
//        if (a%b==0){
//            return b;
//        }
//        return test02(b,a%b);
//    }
//    public static int  yanghui(int x,int y){
//        if (x==y||y==1){
//            return 1;
//        }
//        return yanghui(x-1,y)+yanghui(x-1,y-1);
//    }
    public static void zixin(int n){
        if (n>9){
             zixin(n/10);
        }
        System.out.println(n%10);
    }
}

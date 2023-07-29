package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 10:23
 */
public class test08 {
    public static void main(String[] args) {
//        for (int i = 0; i < 10; i++) {
//            if (i==3){
//                break;
//            }
//            System.out.println(i);
//        }
//        int m=10;
//        String result=m>20? "saa" : "dfd";
//        System.out.println(result);
        String x = "2";
        int i = switch (x) {
            case "1":
                yield 1;
            case "2":
                yield 2;
            default:
                yield 3;
        };
        System.out.println(i);

    }
}

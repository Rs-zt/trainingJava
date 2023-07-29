package teach.aistar.weekday.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 17:43
 */
public class ContinueAndBreakDemo {
    public static void main(String[] args) {
        continueTets();
        breakTest();
        breakTest2();
        breakCodeBlock();
    }

    private static void breakCodeBlock() {
        int n=28;
        qiqi:{
            if (n>=28){
                break qiqi;
            }
            System.out.println("age");
        }
        System.out.println("outer");
    }

    private static void breakTest2() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                if (i==2){
                    break;
                }
                System.out.println(i+" "+j);
            }
        }
        System.out.println("end...");
    }

    private static void breakTest() {
        for (int i = 0; i < 5; i++) {
            if (i==3){
                break;
            }
            System.out.println(i);
        }
        System.out.println("end....");
    }

    private static void continueTets() {
        for (int i = 0; i < 5; i++) {
            if (i==3){
                continue;
            }
            System.out.println(i);
        }
    }
}

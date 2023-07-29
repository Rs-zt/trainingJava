package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 22:29
 */
public class test05 {
    public static void main(String[] args) {
        demo2();

    }

    private static void demo2(){
        int count=0;
        for (int i = 123; i <=432 ; i++) {
            if (i/100 != i/10%10 && i/100 != i%10 && i/10%10 != i%10 && i/10%10>0 && i/10%10<5&&i%10>0 && i%10<5){
                ++count;
                System.out.print(i+"\t");
                if (count%6==0){
                    System.out.println();
                }
            }
        }
    }
    }

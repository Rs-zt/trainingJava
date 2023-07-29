package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 23:03
 */
public class test07 {
    public static void main(String[] args) {
        int n=200;
        int cout=0;
        for (int i = 2; i < n; i++) {
            for (int j = 2; j < i; j++) {
                if(i%j==0){
                    break;
                }
                System.out.println(i+" "+(++cout));
                break;
            }
        }

    }
}

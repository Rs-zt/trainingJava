package teach.aistar.weekday.test;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 16:23
 * 排列组合
 * 打印成这样的组合,这个组合由三位数字组成,数字有1,2,3,4当中的三个组成
 */
public class permutationdemo {
    public static void main(String[] args) {
        int count=0;
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j < 5; j++) {
                for (int k = 1; k < 5; k++) {
                    if (i!=j&&i!=k&&j!=k){
                        System.out.println(i+""+j+""+k);
                        count++;
                        if (count==6){
                            System.out.println(" ");
                            count=0;
                        }
                    }
                }
            }
        }

    }
}

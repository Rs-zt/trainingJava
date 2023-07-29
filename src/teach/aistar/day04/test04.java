package teach.aistar.day04;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 19:33
 */
public class test04 {
    public static void main(String[] args) {
        /**
         * 比如定义一个数组-长度是5.
         * 然后通过普通for循环对数组进行赋值,值的范围[1,6]之间的随机整数.
         * 要求是最终的数组中不能出现重复的数据.
         */
        Arraystest();
    }

    private static void Arraystest() {
        int[] arr = new int[5];
        for (int i = 0; i < arr.length ; ) {
            int a= (int) (Math.random()*6+1);
            int j=0;
            while(j<i){
                if (arr[j]==a){
                    break;
                }
                j++;
            }
            if (i==j){
                arr[i]=a;
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
    }
}

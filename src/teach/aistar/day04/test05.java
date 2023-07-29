package teach.aistar.day04;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 20:35
 */
public class test05 {
    public static void main(String[] args) {
        /**
         * 比如定义一个数组-长度是5.
         * 然后通过普通for循环对数组进行赋值,值的范围[1,6]之间的随机整数.
         * 要求是最终的数组中不能出现重复的数据.
         */

        int[] arr1=new int[5];
        while (true) {
            boolean flag=false;
            int count=0;
            int a = (int) (Math.random() * 6 + 1);
            for (int i = 0; i < arr1.length; i++) {

                if (a==arr1[i]){
                    flag=true;
                    break;
                }
            }
            if (!flag)
                arr1[count++]=a;
            if (count==5)break;
        }
        System.out.println(Arrays.toString(arr1));

    }
}

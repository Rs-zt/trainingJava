package teach.aistar.day04;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 14:53
 */
public class demo4 {
    public static void main(String[] args) {
        int a=10;
        int[] arr1 = {1, 2, 3, 4};
        String aa="dsdbs";
        String[] arr2 = new String[3];
        int [] arr4=arr1;
        arr1=null;
        System.out.println(arr4);
        System.out.println(arr1);
//        arr2[1] = "ere";
//        arr2[0] = "fddfd";
//        arr2[2] = "fdfdhhfjdh";
//        int[] arr3 = new int[]{1, 2, 'a', 'c'};
//        for (int i = 0; i < arr1.length; i++) {
//            System.out.println(arr1[i]);
//        }
//        for (String s : arr2) {
//            System.out.println(s);
//        }
//        for (int i = 0; i < arr3.length; i++) {
//            System.out.println(arr3[i]);
//        }
//        String s = Arrays.toString(arr1);
//        System.out.println(s);
    }
}

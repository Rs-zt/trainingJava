package teach.aistar.day04;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 16:47
 */
public class demo5 {
    public static void main(String[] args) {
        int[] arr1=new int[]{1,3,5};
        int[] arr2={6,9,10};
        System.out.println("main方法"+ Arrays.toString(arr1));
        System.out.println("main方法"+Arrays.toString(arr2));
        test01(arr1,arr2);


    }

    private static void test01(int[] arr1, int[] arr2) {
        arr2=arr1;
        for (int i = 0; i <arr1.length ; i++) {
            arr2[i]=arr2[i]+1;
        }
//        for (int i : arr1) {
//            System.out.println(i);
//            arr2[i]=arr2[i]+1;
//        }
        System.out.println("test01--"+Arrays.toString(arr1));
        System.out.println("test01--"+Arrays.toString(arr2));
    }
}

package teach.aistar.weekday.day04;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 20:36
 */
public class ParamTransferDemo {
    public static void main(String[] args) {
        int[] arr1={1,2,3};
        int[] arr2={4,5,6};
        test(arr1,arr2);
        System.out.println("main-arr1"+ Arrays.toString(arr1));
        System.out.println("main-arr2"+ Arrays.toString(arr2));

    }


    private static void test(int[] arr1, int[] arr2) {
        arr1=arr2;
        for (int i = 0; i < arr2.length; i++) {
            arr2[i]=arr2[i]+1;
        }
        System.out.println("test1-arr1"+Arrays.toString(arr1));
        System.out.println("test1-arr2"+Arrays.toString(arr2));
    }
}

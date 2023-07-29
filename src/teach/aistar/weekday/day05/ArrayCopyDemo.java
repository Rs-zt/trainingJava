package teach.aistar.weekday.day05;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 21:54
 */
public class ArrayCopyDemo {
    public static void main(String[] args) {
        int[] arr={3,1,2};
        //数组的缩容
        System.out.println(Arrays.toString(Arrays.copyOf(arr,2)));
        int[] temp=Arrays.copyOf(arr,arr.length+1);
        temp[temp.length-1]=100;
        System.out.println(Arrays.toString(temp));
        System.out.println(Arrays.toString(arr));
        int[] arr2={1,2,34,4};
        int[] copy=new int[10];
        System.arraycopy(arr2,0,copy,0,4);
        System.out.println(Arrays.toString(copy));
        System.out.println(Arrays.toString(Arrays.copyOf(copy,4)));
    }
}

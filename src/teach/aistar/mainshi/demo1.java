package teach.aistar.mainshi;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/21 11:30
 */
public class demo1 {
    public static void main(String[] args) {
        //测试新增元素
        int[] arr = {3,4,1};
        System.out.println(Arrays.toString(addManyElement(arr, 1, 12, 2, 3)));

    }
    public static int[] addManyElement(int[] arr,int pos,int... target){
        //简单进行校验的动作
        //java.lang.NullPointerException - 空指针异常.
        //什么时候会发生了?  =>   null.东西
        if(null==arr || arr.length==0 || pos<0 || pos>arr.length-1)
            return arr;

        //定义一个新的数组
        int[] temp = new int[arr.length+ target.length];
        //{3,4,1,5,6,7};
        //比如pos=3
        //pos前
        for (int i = 0; i < pos; i++) {
            temp[i] = arr[i];
        }
        //pos处放入值target
        int index=0;
        for (int i = pos; i <pos+ target.length; i++) {
            temp[i]=target[index++];
        }

        //pos后
        for (int i=pos;i<arr.length;i++){
            temp[i+ target.length] = arr[i];
        }
        return temp;
    }
}

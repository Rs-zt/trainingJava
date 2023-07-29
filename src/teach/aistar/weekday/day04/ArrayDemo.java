package teach.aistar.weekday.day04;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 17:06
 */
public class ArrayDemo {
    public static void main(String[] args) {
        //数组的赋值
        String[] arr1 = new String[3];
        //如果没有对数组进行赋值,系统会根据元素类型来分配默认值
        System.out.println(arr1[0]);
        //获取数组的长度-属性length
        System.out.println(arr1.length);
        arr1[0]="java";
        arr1[1]="c++";
        arr1[2]="python";
        //数组遍历方式
        //通过下标遍历
        System.out.println(arr1[0]);
        //赋值方式
        //定义一个数组的同时进行一个赋值
        int arr2[]={1,3,5,'4','5'};
        //通过普通for循环进行遍历
        int[] arr3 = new int[5];
        for (int i = 0; i < arr2.length; i++) {
            arr3[i] =(int) (Math.random() * 100 + 1);
        }
        //增强for循环
        for (int i : arr3) {
            System.out.println(i);
        }
        //数组工具类的遍历方式
        String s = Arrays.toString(arr3);
        System.out.println(s);
    }
}

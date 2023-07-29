package teach.aistar.weekday.day04;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 16:57
 */
public class ArrayAddressDemo {
    public static void main(String[] args) {
        int a=10;
        //基本类型传参--把变量的值拷贝一份给形参--"值传递
        add(a);
        System.out.println("main-a"+a);
        //对象传参-变量的地址拷贝一份给形参--"引用传递/地址传递
        int[] arr={1,2,34,5};
        changge(arr);
        System.out.println("main-arr"+ Arrays.toString(arr));
    }

    private static void changge(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i]=arr[i]+1;
        }
        System.out.println("changge---->"+Arrays.toString(arr));
    }

    private static void add(int a) {//形参也在栈区
        a=100;
        System.out.println("add-a"+a);

    }
}

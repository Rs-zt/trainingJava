package teach.aistar.weekday.day04;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 17:18
 */
public class ArrayMemoryDemo {
    public static void main(String[] args) {
        //①通过new关键字,会在堆开辟一个区域,申请空间
        //②然后给这个对象进行初始化
        //③将这个对象在堆空间中的内存地址赋值给了一个应用变量arr1,然后存储在栈区
        int[] arr1={1,2,3};
        System.out.println(arr1);
        int[] arr2={1,2,3};
        System.out.println(arr2);
        System.out.println(arr1==arr2);//fasle
        //在java中永远比较的是值
        System.out.println(Arrays.equals(arr1,arr2));//false
        //char类型数组比较特殊
        char[] crr={'a','b','x'};
        System.out.println(crr);
        System.out.println(""+crr);
        System.out.println("====引用对象和对象的关系");
        //创建一个对象arr3->认为arr3就是这个对象名臣=>这句话是不对的
        //因为arr3={1,2,3}仅仅是这个数组对象的引用而已
        int[] arr3={1,2,3};
        //引用和对象之间一个什么关系
        //引用里面保存的就是对象在堆空间中的内存地址
        //引用和对象之间的映射关系-符合"气球气球理论
        //1.一个引用在某一个时刻只能指向一个对象
        //2.一个对象在某个时刻只能指向一个对象
        int[] arr4=arr3;
        System.out.println("======垃圾对象-没有任何引用指向的指向====");
        int[] arr5={1,2,3};
        //arr5重新赋值了-null,代表arr5已经不在指向原来的对象{1,2,3}
        //{1,2,3}这个对象已经没有任何引用指向了->垃圾对象=>等待GC回收
        //int[] arr6=arr5;
        int[] arr6=arr5;
        arr5=null;
        System.out.println(arr5);
        System.out.println(Arrays.toString(arr6));

    }
}

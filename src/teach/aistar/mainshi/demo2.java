package teach.aistar.mainshi;

import java.util.Arrays;


/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/21 11:54
 */
public class demo2 {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 3, 1, 2, 3, 5, 2};
        System.out.println(getMaxElement(arr));
//        System.out.println(findIndexByTarget(arr, 4));
        System.out.println(Arrays.toString(delByIndex(arr, 3)));
//        System.out.println(Arrays.toString(delByIndex(arr, 1)));
//        System.out.println(Arrays.toString(delRepeatElement(arr)));
        System.out.println(Arrays.toString(delByTarget(arr, 1)));
//        countSort();
    }

    /**
     * 找出数组中的最大值
     *
     * @param arr
     * @return
     */
    public static int getMaxElement(int[] arr) {
//        int j = 0;
        //假设arr[0]是最大值
        int max=arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max<arr[i]){
                max=max^arr[i];
                arr[i]=max^arr[i];
                max=max^arr[i];
            }
//            while (j < i) {
//                if (arr[j] > arr[i]) {
//                    break;
//                }
//                j++;
//            }
        }
        return max;
    }

    /**
     * 找出目标数据target在原数组中所有的下标位置,并且将所有的下标放入到一个数组中,返回出去
     *
     * @param arr    原数组
     * @param target 需要查找的元素
     * @return 该元素在arr中所有的下标
     */
    public static int[] findIndexByTarget(int[] arr, int target) {
        int[] arr1 = new int[arr.length];
        int count = 0;//记录下标的值
        for (int i = 0; i < arr.length; i++) {
            if (target == arr[i]) {
                arr1[count++] = i;//如果相同就把下标放入arr1数组中
            }

        }
        int[] arr2 = new int[count];
        System.arraycopy(arr1, 0, arr2, 0, count);
        System.out.println(Arrays.toString(arr2));
        return arr2;
    }

    /**
     * 根据下标删除arr中对应位置的元素 - 根据下标进行删除
     *
     * @param arr   原数组
     * @param index 下标
     * @return
     */
    public static int[] delByIndex(int[] arr, int index) {
        int[] arr1 = new int[arr.length - 1];
        for (int i = 0; i < arr.length; i++) {
            if (index == i) {
                System.arraycopy(arr, 0, arr1, 0, index);
                System.arraycopy(arr, index + 1, arr1, index, arr.length - index - 1);
            }

        }
        return arr1;
    }

    /**
     * 根据元素进行删除 - 删除数组arr中所有的目标数据target
     *
     * @param arr    原数组
     * @param target 需要删除的数据
     * @return
     */
    public static int[] delByTarget(int[] arr, int target) {
//        System.out.println(findIndexByTarget(arr, target));
        int count = 0;
        int[] arr3 = findIndexByTarget(arr, target);
        int[] arr4 = arr;
        for (int i = 0; i < arr3.length;i++ ) {
//            count++;
            arr4 = delByIndex(arr4, arr3[i]-i);
//            if (i == arr3.length - 1) break;
//            arr3[++i] -= count;

        }
        return arr4;
    }

    /**
     * 面试概率及其高
     * 数组去重/排重操作
     * 将数组中重复的数据去除,只保留一个
     * 比如原数组数据是[1,1,2,3,2,5,4,3,5] => 去重之后的数组是[1,2,3,5,4];
     * <p>
     * 思路一:
     * arr = {1,1,2,3,1,2,3,5,2}
     * temp ={0,0,0,0,0,0,0,0,0}
     * <p>
     * arr = {}
     * temp ={1,2,3,5,0,0,0,0,0}
     *
     * @param arr
     * @return
     */
    public static int[] delRepeatElement(int[] arr) {
        int[] arr1 = new int[arr.length];
        int count = 0;
        int index = 0;
        for (int i = 0; i < arr.length; ) {
            arr1[count] = arr[i];
            int j = 0;//判断索引
            count++;
            while (true) {
                if (i == 0) break;
                if (arr1[j] == arr1[index]) {
                    if (index == j) break;
                    arr1 = delByIndex(arr1, index);
                    index--;//删除一个数组长度减一
                    count--;//删除一个索引减一
                }
                if (j == index) break;
                j++;
            }
            i++;
            index++;
        }
        return arr1;
    }
    //附加题 - "百度公司面试题"
    //给定一个数组,长度为20,里面存储[1,5]之间的随机数 - 允许重复
    //1. 统计出每个随机数出现的次数.
    //2. 根据出现的次数进行一个降序排.

    //定义二维数组的行=> 计算出来的.

    //透漏 => 二维数组 =>  出现过的随机数的个数(行) - 2列
    //如果所有的随机数都出现了,就是5行...

    //  5 6
    //  4 3
    //  2 2
    //  1 1
    //  3 8
    public static void countSort() {
        int[] arr1 = new int[20];
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            arr1[i] = (int) (Math.random() * 6 + 1);
        }
//    System.out.println(Arrays.toString(arr1));
        //1. 统计出每个随机数出现的次数.
        int[] arr2 = delRepeatElement(arr1);
//    System.out.println(Arrays.toString(arr2));
        int[][] arr3 = new int[arr2.length][2];
        for (int i = 0; i < arr3.length; i++) {
            arr3[i][0] = arr2[i];
            for (int s : arr1) {
                if (s == arr3[i][0]) count++;
            }
            for (int j = 0; j < arr3[i].length; j++) {
                arr3[i][1] = count;
                System.out.print(arr3[i][j] + " ");
            }
            System.out.println();
            count = 0;
        }
        for (int i = 0; i < arr3.length; i++) {
            while (true) {
                int j = 0;
                if (arr3[j][1] <= arr3[i][1]) {
                    arr3[j][1] = arr3[i][1] ^ arr3[j][1];
                    arr3[i][1] = arr3[i][1] ^ arr3[j][1];
                    arr3[j][1] = arr3[i][1] ^ arr3[j][1];
                }
                j++;
                if (j == i) break;
            }
        }
        for (int i = 0; i < arr3.length; i++) {
            for (int j = 0; j < arr3[i].length; j++) {
                System.out.print(arr3[i][j] + "\t");
            }
            System.out.println();
        }
//    System.out.println(Arrays.toString(arr3));

    }
}

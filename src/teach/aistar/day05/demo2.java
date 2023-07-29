package teach.aistar.day05;

import java.util.Arrays;

import static java.util.Arrays.sort;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/21 14:15
 */
public class demo2 {
    public static void main(String[] args) {
        int[] arr= new int[]{4,2,7,3,73,8,9,6};
//        SortDirect(arr);
//        Bubblingsort1(arr);
        quickSort(arr,0, arr.length-1);
        System.out.println(Arrays.toString(arr));

    }

    private static void Bubblingsort1(int[] arr) {
        if (null==arr||arr.length==0)return;
        int temp=0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i ; j++) {
                if (arr[j]>arr[j+1]){
//                    arr[j]=arr[j]^arr[j+1];
//                    arr[j+1]=arr[j]^arr[j+1];
//                    arr[j]=arr[j]^arr[j+1];
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }



    private static void SortDirect(int[] arr) {
        if (null==arr||arr.length==0)return;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j >0 ; j--) {
                if (arr[j-1]>arr[j]){
                    arr[j-1]=arr[j-1]^arr[j];
                    arr[j]=arr[j-1]^arr[j];
                    arr[j-1]=arr[j-1]^arr[j];
                }
            }
        }
    }
    /**
     * 快速排序
     * @param arr
     * @param startIndex
     * @param endIndex
     */
    public static void quickSort(int[] arr,int startIndex,int endIndex){
        if(startIndex<endIndex) {
            //1. 找到重合的位置
            //分区 - 挖坑填数
            int index = getIndex(arr, startIndex, endIndex);

            //2. 递归调用自己
            //index左边的
            quickSort(arr, startIndex, index - 1);

            //index右边的
            quickSort(arr, index + 1, endIndex);
        }
    }

    private static int getIndex(int[] arr, int startIndex, int endIndex) {
        int i = startIndex;
        int j = endIndex;
        //1. 确定基准数
        int x = arr[i];

        while(i<j){
            //由后向前找比它小的数,找到后挖出此数填到前一个坑中
            while(i<j && arr[j]>=x){
                j--;
            }
            //如果arr[j]<x
            if(i<j){
                arr[i] = arr[j];
                i++;
            }
            //**由前向后找比它大或等于的数,找到后也挖出此数填到前一个坑中**
            while(i<j && arr[i]<x){
                i++;
            }

            if(i<j){
                //arr[i]开始大于等于x
                arr[j] = arr[i];
                j--;
            }
        }
        //说明i开始j重合
        arr[i] = x;//把基准数放入到重合的位置
        return i;
    }
}

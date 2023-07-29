package teach.aistar.mainshi;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/21 13:18
 */
public class demo4 {
    public static void main(String[] args) {
        int [] arr={1,3,65,3,78,45,56,34,23,65,12,13,11};
        bubbleSort(arr);
    }
    /**
     * 冒泡排序 - 从小到大
     * @param arr
     */
    public static void bubbleSort(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    arr[j] = arr[j]^arr[j+1];
                    arr[j+1] = arr[j]^arr[j+1];
                    arr[j] = arr[j]^arr[j+1];
                }
            }
        }
    }

}

package teach.aistar.day05;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/21 9:26
 */
public class test01 {
    public static void main(String[] args) {
        int[][] arr1=new int[3][4];
        arr1[0]=new int[2];
        arr1[1]=new int[3];
        arr1[2]=new int[8];
        System.out.println(Arrays.deepToString(arr1));
        int[][] arr2 = new int[][]{{2,3,4},{5,6,3,2},{8,6,0,4},{1,2}};
        for (int i = 0; i <arr2.length ; i++) {
            for (int j = 0; j <arr2[i].length ; j++) {
                System.out.print(arr2[i][j]+"\t");
            }
        }
        System.out.println();
        for (int[] outer : arr2) {
            for (int i : outer) {
                System.out.print(i+"\t");
            }
            System.out.println();
        }
        int[][] arr3 ={{2,3,4},{5,6,3,2},{8,6,0,4},{1,2}};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println(Arrays.toString(arr3[i]));
        }
    }
}

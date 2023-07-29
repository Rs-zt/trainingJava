package teach.aistar.weekday.day04.homework;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 21:46
 */
public class TestBallArray {
    public static void main(String[] args) {
        ball();
    }

    private static void ball() {
        int[] arr=new int[5];
        for (int i = 0; i < arr.length; i++) {
            //先生成一个随机数
            int n= (int) (Math.random()*6+1);
            arr[i]=n;
            //然后采取检测n是否在[0,j]期间是否有重复
            for (int j = 0; j < i; j++) {
                if (arr[j]==n){
                    i--;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

    }
}

package teach.aistar.day05;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/21 10:27
 */
public class demo1 {
    public static void main(String[] args) {
        String[][] poems = {
                {"白","日","依","山","尽"},
                {"黄","河","入","海","流"},
                {"欲","穷","千","里","目"},
                {"更","上","一","层","楼"}
        };

        change(poems);
    }

    private static void change(String[][] poems) {
//        int a=poems[0].length;
//        int b=poems.length;
//        String [][] str=new String[5][4];
//        for (int i = 0; i < poems.length ; i++) {
//            for (int j = 0; j <poems[i].length ; j++) {
//                str[j][i]=poems[i][j];
//            }
//        }
//        for (int i = 0; i < str.length ; i++) {
//            for (int j = 0; j <str[i].length ; j++) {
//                System.out.print(str[i][j]);
//            }
//            System.out.println();
//        }
//
        int index=0;
        String[] arr3=new String[poems.length*poems[0].length];
        for (int i = 0; i < poems.length ; i++) {
            for (int j = 0; j <poems[i].length ; j++) {
                arr3[index++]=poems[i][j];
            }
        }
        String[][] str=new String[5][4];
        for (int i = 0; i < str.length ; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                str[i][j]=arr3[i+j*2];
            }
        }
        for (int i = 0; i < str.length ; i++) {
            for (int j = 0; j <str[i].length ; j++) {
                System.out.print(str[i][j]);
            }
            System.out.println();
        }
    }

}

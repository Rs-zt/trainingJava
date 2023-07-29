package teach.aistar.weekday.test;

import teach.aistar.weekday.day01.RecursionDemo;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 15:34
 * 作业
 */
public class DiamodDemo {
    public static void main(String[] args) {
        printDiamond();
        printDiamond2();
        printYanghui(5);
    }

    /**
     *        *
     *       *
     *      *
     *     *
     *    *
     *
     *    i = 0,j=4, i = 1,j=3
     *
     *    *
     *     *
     *      *
     *       *
     *        *
     *    i=0,j=4,  i=1,j=5   => 右上
     *
     *    *
     *     *
     *      *
     *       *
     *        *   左下
     *
     *     i=4,j=0  i=5,j=1
     *
     *               *
     *              *
     *             *
     *            *
     *           *
     *    i = 8 j=4   i=7 j=5
     *
     */

    private static void printDiamond() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j==4||j-i==4||i-j==4||i+j==12){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
    private static void printDiamond2(){
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (i+j<4||j-i>4||i-j>4||i+j>12){
                    System.out.print(" ");
                }
                else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }

    private static void printYanghui(int x) {
        for (int i = 1; i <=x; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(RecursionDemo.yanghui(i,j));
            }
            System.out.println();
        }
    }
}

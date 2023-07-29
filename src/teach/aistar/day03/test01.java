package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 16:29
 */

/**
 *
 * *********
 * *********
 * *********
 * *********
 *
 *     *
 *    ***
 *   *****
 *  *******
 */
public class test01 {
    public static void main(String[] args) {
        int a=7;
        for (int i = 1; i < a; i++) {
            for (int k = 1; k <a-i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                if ((j==1)|| (j==2*i-1)|| (i==a)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        for (int i = 1; i < a; i++) {
            for (int k = 1; k <i ; k++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*(a-i); j++) {
                if ((j==1)|| (j==2*(a-i)-1)){
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

    }
}

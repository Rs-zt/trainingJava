package teach.aistar.weekday.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 20:41
 */
public class PrimeDemo {
    public static void main(String[] args) {
        printPrime();
    }

    private static void printPrime() {
        //定义一个计数器
        int count=0;
        for (int i = 2; i <=199 ; i++) {
            //判断n是否为质数,只要找出除了1和它本身以外的,是否还能够被一个数整除
            //每次遇到一个新的数字的时候
            //定义一个标记位
            boolean flag=true;
            //for的作用是判断n是否是质数
            for (int j = 2; j <=Math.sqrt(i); j++) {
                if (i%j==0){
                    //说明不是质数
                    flag=false;
                    //找到一个,不需要找
                    break;
                }
            }
            if (flag){
                System.out.println(i+"\t");
                if (++count==7){
                    System.out.println();
                    count=0;
                }
            }
        }
    }
}

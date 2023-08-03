package teach.aistar.day13.homework;

import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/2 17:49
 */
public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入条形码");
        String str = sc.next();
//        String str="6902827110013";
        System.out.println(jiaoyanma(str));


    }
    //条形码
    public static boolean jiaoyanma(String str){
        if (!str.matches("\\d{13}")){
            System.out.println("条形码输入错误!!!");
        }
        int X=0;
        char[] str1=str.toCharArray();
        int sum=0;
        int Jsum=0;
        for (int i = str1.length-1; i > 0; i--) {
            if (i%2!=0){
                sum +=(str1[i]-48);
            }
        }
        sum*=3;
        for (int i = str1.length-3; i >= 0; i--) {
            if (i%2==0){
                Jsum+=(str1[i]-48);
            }
        }
        int result=sum+Jsum;
        if (result%10==0){
            X=0;
        }else {
            X=10-result%10;
//            int res=((result/10)+1)*10;
//            X=res-result;
        }
        if (X==(str1[str1.length-1]-48)){
            return true;
        }else {
            return false;
        }
    }
}

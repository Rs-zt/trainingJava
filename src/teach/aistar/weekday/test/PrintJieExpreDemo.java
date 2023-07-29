package teach.aistar.weekday.test;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 16:28
 */
public class PrintJieExpreDemo {
    public static void main(String[] args) {
        printDemo(6);
    }

    public static  void  printDemo(int i) {
        long sum=0L;//保存每个数字的阶乘的总和
        //定义字符串,来拼接最终的表达式
        String str="";
        int s=1;
        for (int j = 1; j <=i; j++) {
            //定义变量-每个n的阶乘值
            s*=i;
            System.out.println(j+"!="+s);
            sum+=s;
            //字符串的拼接
            str+=(i!=i)?(j+"!+"):(j+"!=");
        }
        System.out.println(str+sum);

    }
}

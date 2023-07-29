package teach.aistar.weekday.day01;

import java.math.BigDecimal;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/22 13:56
 * 运算符
 */
public class DoubleDemo {
    public static void main(String[] args) {
        System.out.println(0.1+0.3);
        //数据比long 还大,使用java.Math.BigInteger
        BigDecimal m = new BigDecimal("0.3");
        BigDecimal n = new BigDecimal("0.2");
        System.out.println(m.add(n));
        System.out.println("oo\bp");//\b退格
        System.out.println("他说:\"琪琪`\"");//\"
        System.out.println("hello\twold");//\t制表符
        //idea=>tom
        //计算机终端=>tomin
        System.out.println("admin\rtom");//\r回车,输出完,光标停在当前的行的起始位置
        System.out.println("\\");//转移字符

    }
}

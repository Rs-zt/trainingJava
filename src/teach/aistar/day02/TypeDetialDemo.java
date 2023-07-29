package teach.aistar.day02;

import java.math.BigDecimal;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/18 9:26
 */
public class TypeDetialDemo {
    public static void main(String[] args) {
        //二进制的转换以0b开始
        int a=0b1010;
        System.out.println(a);
        //八进制的转换以0开始
        int b=021;
        System.out.println(b);
        //十六进制的转换以0x开始
        int c=0xA0;
        System.out.println(c);
        BigDecimal m = new BigDecimal("0.2");
        BigDecimal n = new BigDecimal("0.2");
        System.out.println(m.add(n));
        char g='a'+1;
        char j='.';
        System.out.println(j);
    }
}

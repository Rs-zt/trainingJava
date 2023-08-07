package teach.aistar.weekday03.day12;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 22:55
 */
public class StringInternDemo {
    public static void main(String[] args) {
        //1. 堆 - "1","23","123"
        //2. 串池中只有"1"和"23"
        String s1 = new String("1") + new String("23");
        //intern - 用来判断常量池中是否包含某个字符串.
        //如果不存在,强制入池 - 并不是把"123"内容放入到常量池,而是把"123"在堆空间中的内存地址放入到常量池.
        //s1还是指向堆中"123"的地址
        //s1.intern();  //true

        //直接将 "123"串池中的地址赋值给s2
        String s2 = "123";

        //如果存在,直接返回常量池中的地址
        s1.intern();//false

        System.out.println(s1 == s2);
    }
}

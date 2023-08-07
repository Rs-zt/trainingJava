package teach.aistar.weekday03.day12;

import java.util.Arrays;
import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 22:56
 */
public class StringMethodDemo {
    public static void main(String[] args) {
        String str = "abc";
        //1. 拼接,返回的是一个新的字符串
        //jdk17是对concat进行了改写 - 直接操作的是字节数组 - 肯定比操作char[]性能要高.
        String concatStr = str.concat("123");
        System.out.println(concatStr);//abc123

        //2. 将字符串转换成字符数组 - 很重要
        char[] arr = concatStr.toCharArray();
        System.out.println(arr);//abc123

        //3. 字符串是支持随机访问的 - 可以通过下标访问.
        // 下标的范围[0,字符串长度-1]
        System.out.println(concatStr.length());//6
        //通过下标进行访问 char charAt(int index);

        //注意下标不能够越界,否则会抛出java.lang.StringIndexOutOfBoundsException字符串下标越界异常
        char c = "hello".charAt(1);//e
        System.out.println(c);

        //4. 字符串的比较
        System.out.println("abc123".equals(concatStr));//true
        //忽略大小写的比较
        System.out.println("abc".equalsIgnoreCase("AbC"));//true

        //5. 判断前缀和后缀
        System.out.println("xx.gif".endsWith("gif"));//true
        System.out.println("Javascript".startsWith("Java"));//true

        //6. 大小写的转换
        System.out.println("abc".toUpperCase());
        System.out.println("DEF".toLowerCase());

        //7. 判断某个字符/字符串 在指定字符串中第一次出现的位置[从左到右]
        //System.out.println("hollo".indexOf('o'));
        System.out.println("hoolloo".indexOf("oo"));

        //从下标2位置[包含]开始,向右查找,第一次出现"o"的下标
        System.out.println("holloo".indexOf("o",2));

        //最后一次出现p的下标
        System.out.println("pxxps".lastIndexOf("p"));//3

        //TODO... 正则表达式
        //8. 字符串的切割
        String ip = "192.168.1.2";
        //根据.进行切割,返回一个字符串数组
        //正则表达式=>   .比较特殊,有特殊意义=>代表任意字符的
        String[] ips = ip.split("\\.");
        System.out.println(Arrays.toString(ips));

        //9. 替换
        System.out.println("i love girl".replace("girl","java"));

        //10. 截取
        //String substring(int startIndex);
        //String substring(int startIndex,int endIndex);// [startIndex,endIndex)

        //11. 将其他类型转换成String类型
        // static String valueOf(int n);
        // static String valueOf(Object o);
        //int=>String
        String x = String.valueOf(10);
        System.out.println(x);
        Integer i = 10;
        //Integer=>String
        String y = String.valueOf(i);
        System.out.println(y);

        //12. 去除两边的空格
        System.out.println("   he llo   ".trim());
        System.out.println("   he llo   ".trim().length());
        System.out.println("        ".trim().length());//0  ""

        //TODO...
        //没有创建对象,s1不指向任何对象
        String s1 = null;
        //创建了对象-""
        String s2 = "\n";

        //13. 重复
        System.out.println("*".repeat(5));

        //14. 判读字符串是否为空

        //返回true   s2="",长度为0的字符串,返回true
        System.out.println(s2.isEmpty());//false

        //1. 长度为0  或者 2. 空白字符串,比如\n \s \r
        System.out.println(s2.isBlank());//true

        //15. 日期需要格式化成字符串
        Date date = new Date();
        //String strDate = String.format("%tF",date);//2023-08-01

        String strDate = String.format("%tT",date);//15:00:41
        System.out.println(strDate);

        //判断是否包含
        System.out.println("ooxxppoo".contains("oo"));//true
    }
}

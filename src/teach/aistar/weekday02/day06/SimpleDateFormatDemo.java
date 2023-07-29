package teach.aistar.weekday02.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 18:00
 */
public class SimpleDateFormatDemo {
    public static void main(String[] args) throws ParseException {
        Date date = new Date();
        System.out.println(date);
        //利用pattern来构建SimpleDateFormat对象
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss E");
        //将日期格式化成日期/字符串
        String s = sdf.format(date);
        System.out.println(s);
        System.out.println("=====将字符串解析成Date======");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        String str="2023-02-23";
        Date parse = simpleDateFormat.parse(str);
        System.out.println(parse);

    }
}

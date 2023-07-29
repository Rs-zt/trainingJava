package teach.aistar.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/24 15:55
 */
public class SimpleDateDemo {
    public static void main(String[] args) {
//        Date date=new Date();
//        System.out.println(date);
//        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//        String format = sdf.format(date);
//        System.out.println(format);
//        System.out.println("------------------");
//        String str="2023-02-23";
//        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
//        Date parse=null;
//        try {
//             parse = sdf1.parse(str);
//        } catch (ParseException e) {
//            System.out.println("格式写错了");
//        }
//        System.out.println(parse);
        Date date=new Date();
        String simpleformat = SimpleDateUtil.simpleformat(date, "yyyy-MM-dd");
        System.out.println(simpleformat);
        System.out.println("------------------");
        String str="2023-02-23";
        Date date1 = SimpleDateUtil.SimpleParse(str, "yyyy-MM-dd");
        System.out.println(date1);

    }

}

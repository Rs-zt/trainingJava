package teach.aistar.day06;

import java.util.Calendar;
import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/24 14:55
 */
public class Caldener {
    public static void main(String[] args) {
        Calendar cal= Calendar.getInstance();
        System.out.println(cal);
        //打印年
        System.out.println("年:"+cal.get(Calendar.YEAR));
        //打印月
        System.out.println("月:"+cal.get(Calendar.MONTH)+1);
        //打印日
        System.out.println("日:"+cal.get(Calendar.DAY_OF_MONTH));
        //打印周几
        System.out.println("周几:"+(cal.get(Calendar.DAY_OF_WEEK)-1));
        //打印时
        System.out.println("时:"+cal.get(Calendar.HOUR_OF_DAY));
        //打印分
        System.out.println("分:"+cal.get(Calendar.MINUTE));
        //打印秒
        System.out.println("秒:"+cal.get(Calendar.SECOND));
        Date time=cal.getTime();
        System.out.println(time);
        System.out.println("----------------------");
        Calendar calendar=Calendar.getInstance();
        calendar.set(1,2021);
        System.out.println(calendar.getTime());
        System.out.println("---------------------");
        calendar.set(2001,7,23);
        System.out.println(calendar.getTime());
        Date dt = new Date(2001-1900,2,3);                                                                                                          
        calendar.setTime(dt);
        System.out.println(calendar.getTime());
    }
}

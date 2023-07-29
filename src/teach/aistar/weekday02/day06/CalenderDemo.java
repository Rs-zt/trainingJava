package teach.aistar.weekday02.day06;

import java.sql.SQLOutput;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 16:50
 */
public class CalenderDemo {
    public static void main(String[] args) {
        //1.创建日历对象,利用的是简单工厂的创建方式
        //设计模式-将对象的创建和对象的使用进行了解耦
        Calendar cal=Calendar.getInstance();
        System.out.println(cal);
        //int year=cal.get(1);通过字面量-可读性比较差
        //Calendar.YEAR=100;
        //利用Calendar日历类中定义的那些公开的静态的常量属性进行传参
        System.out.println(Calendar.YEAR);
        int year=cal.get(Calendar.YEAR);
        System.out.println("year:"+year);
        int month=cal.get(Calendar.MONTH)+1;
        System.out.println("month:"+month);

        System.out.println("hours:"+cal.get(Calendar.HOUR_OF_DAY));
        System.out.println("minter:"+cal.get(Calendar.MINUTE));
        System.out.println("seconds:"+cal.get(Calendar.SECOND));

        //周几
        //周日是数字1---Calender;
        //周日是数字0---Date;
        System.out.println("week:"+(cal.get(Calendar.DAY_OF_WEEK)-1));
        //因为Calendar中的字段比较多,可能只需要Date部分的内容
        Date d=cal.getTime();
        System.out.println(d);
        System.out.println("===========");
        Calendar calendar=Calendar.getInstance();
        //设置年份
        cal.set(Calendar.YEAR,2022);
        calendar.set(2021,2,23);
        Date dt=new Date(2010-2019,4,1);
        calendar.setTime(dt);
        System.out.println(calendar.getTime());


    }
}

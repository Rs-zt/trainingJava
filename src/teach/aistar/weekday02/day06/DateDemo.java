package teach.aistar.weekday02.day06;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 17:30
 */
public class DateDemo {
    public static void main(String[] args) {
        //1.创建一个日期对象-原因是方法都是非静态的,必须使用对象来调
        //获取当前系统时间
        Date date = new Date();
        System.out.println(date);
        //根据指定的年月日来构建指定的日期
        Date date1 = new Date(2023-1900,4,24);
        System.out.println(date1);
        //获取当前系统时间的毫秒数-返回自1970年1月1日以来,
        long t1=date.getTime();
        //唯一性-订单号可以基于毫秒数-再次组合
        System.out.println(t1);

        long t2=System.currentTimeMillis();
        System.out.println(t2);

        //根据指定的毫秒数来构建新的对象
        Date date2 = new Date(547574785578L);
        System.out.println(date2);
        //构建三天后的日期
        Date date3 = new Date(new Date().getTime() + 3 * 24 * 60 * 60 * 1000);
        System.out.println(date3);

        System.out.println("--------------");
        Date date4 = new Date();
        int year=date4.getYear()+1900;
        System.out.println("year:"+year);
        //获取月份
        int month=date4.getMonth()+1;
        System.out.println(month);
        //获取星期几
        System.out.println(date4.getDay());
        //获取今天几号
        System.out.println(date4.getDate());
        System.out.println(date4.getHours());
        System.out.println(date4.getMinutes());
        System.out.println(date4.getSeconds());
        System.out.println("==========");
        Date date5 = new Date();
        date5.setYear(2022-1900);
        System.out.println(date5);


    }
}

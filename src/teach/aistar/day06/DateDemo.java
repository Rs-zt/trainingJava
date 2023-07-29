package teach.aistar.day06;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/24 11:15
 */
public class DateDemo {
    public static void main(String[] args) {
        //获取当前系统时间
        Date date = new Date();
        System.out.println(date);
        long time = date.getTime();
        System.out.println(time);//打印毫秒数
        //指定年月日来构建日期
        Date date1 = new Date(2023 - 1900, 6, 24);
        System.out.println(date1);
        //构建一个三天后的日期
        Date date2 = new Date(new Date().getTime() + 3 * 24 * 60 * 60 * 1000);
        System.out.println(date2);
        System.out.println("----------------------");
        Date date3 = new Date();
        int year = date3.getYear() + 1900;
        System.out.println(year);
        System.out.println(date3);
        System.out.println("-------------");//日期字段的设置
        Date date4 = new Date();
        date4.setYear(2022 - 1900);
        System.out.println(date4);

    }
}

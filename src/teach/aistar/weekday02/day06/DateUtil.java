package teach.aistar.weekday02.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 18:06
 */
public class DateUtil {
    /**
     * 根据指定的年月日来返回一个Date类型
     * @param year
     * @param month
     * @param date
     * @return
     */
    public static Date createDate(int year,int month,int date){
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,date);

        //Calendar类型是转换成Date类型
        //提供的Date getTime();
        return cal.getTime();
    }

    /**
     * 返回某年某月某日是周几
     * @param year
     * @param month
     * @param date
     * @return
     */
    public static int getWeek(int year,int month,int date){
        Calendar cal = Calendar.getInstance();
        //void set(int field,int value)
        //void set(int year,int month,int date);//重载方法
        cal.set(year,month-1,date);
        return cal.get(Calendar.DAY_OF_WEEK)-1;
    }
    public static String SimpFormat(Date date,String pattern){
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(pattern);
        return simpleDateFormat.format(date);
    }
    public static Date SimpPare(String str,String partten) throws ParseException {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(partten);
        Date parse = simpleDateFormat.parse(str);
        return parse;

    }
    /**
     * 返回某年某月的最大天数.
     * @param year 年份
     * @param month 月份
     * @return 最大天数
     */
    public static int getMax(int year,int month){
        //以后,会在进行写逻辑之前,会先进行参数的校验
        if(year<=0){
            System.out.println("sorry,year不合法!");
            return -1;//错误的标识-1
        }
        if(month<1 || month>12){
            System.out.println("sorry,month不合法!");
            return -1;//错误的标识-1
        }

        //TODO... 真正的核心的
        int day = -1;//变量在使用之前必须要进行初始化.

        if(month==1 || month==3 || month==5 || month == 7 || month==8 || month==10 || month==12){
            day = 31;
        }else if(month == 2){
            //很多种写法...
            //写法一.
//            boolean flag = isLeapYear(year);
//            if(flag){
//                day = 29;
//            }else{
//                day = 28;
//            }

            //写法二
//            day = 28;
//            if(isLeapYear(year))
//                day++;

            //写法三 - 三元操作符   表达式/boolean值?result1:result2
            //day = isLeapYear(year)?29:28;

            //写法四 - 利用jdk内置的GregorianCalendar中提供的boolean isLeapYear(int year)
            day = new GregorianCalendar().isLeapYear(year)?29:28;
        }else{
            day = 30;
        }

        return day;
    }

    /**
     * 给定一个年份,判断是否为闰年
     *
     * 判断的有俩个,其中一个成立,就返回true
     * 1. 如果year能够直接被400整除 -> 返回true
     *
     * 2. 或者year能够被4整除但是不能够被100整除 -> 返回true
     *
     * @param year 正数
     * @return
     */
    public static boolean isLeapYear(int year){
        //写法一:
//        if(year%400==0 || (year%4==0 && year%100!=0)){
//            return true;
//        }else {
//            return false;
//        }

        //写法二:
        if(year%400==0 || (year%4==0 && year%100!=0))
            return true;
        return false;

        // 写法三:
        //return year%400==0 || (year%4==0 && year%100!=0);
    }
}

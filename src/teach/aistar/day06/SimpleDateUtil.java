package teach.aistar.day06;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/24 16:09
 */
public class SimpleDateUtil {
    public static Date createDate(int year,int month,int date){
        Calendar cal = Calendar.getInstance();
        cal.set(year,month-1,date);

        //Calendar类型是转换成Date类型
        //提供的Date getTime();
        return cal.getTime();
    }
    public static String simpleformat(Date date1,String Pattern){
        SimpleDateFormat sdf = new SimpleDateFormat(Pattern);
        String format = sdf.format(date1);
        return format;
    }
    public static Date SimpleParse(String date,String Parent){
        SimpleDateFormat sdf = new SimpleDateFormat(Parent);
        Date parse=null;
        try {
             parse = sdf.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        return parse;
    }
}

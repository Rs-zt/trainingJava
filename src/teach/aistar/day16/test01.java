package teach.aistar.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 10:00
 */
public class test01 {

    public static void main(String[] args) {
        try {
            Class<?> c=Class.forName("java.lang.String");
             new SimpleDateFormat("yyyy-MM-dd").parse("2000/2/11");
        }
        catch(ParseException e) {
//            System.out.println(e.getStackTrace());//打印错误的地址
//            System.out.println(e.getMessage());//打印错误信息
            System.out.println(e.toString());//打印错误详细信息
//            e.printStackTrace();//在控制台上打印 Throwable 对象封装的异常信息
        }finally {
            System.out.println("end...");
            return ;
        }
    }
//    public static int TryDemo(){
//    }
}

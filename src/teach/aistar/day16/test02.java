package teach.aistar.day16;

import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 10:00
 */
public class test02 {

    public static void main(String[] args) {
        try {
            Class<?> c=Class.forName("java.lang.Strings");
             new SimpleDateFormat("yyyy-MM-dd").parse("2000/2-11");
        }
        catch (ClassNotFoundException e){
            System.out.println(e.getMessage()+"=====");
        }
        catch (ParseException e){
            System.out.println(e.getMessage());
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
//        System.out.println("jdk7.x-------");
//            try {
//                Class<?> c=Class.forName("java.lang.String");
//                new SimpleDateFormat("yyyy-MM-dd").parse("2000/2-11");
//            } catch (ClassNotFoundException | ParseException e) {
////                System.out.println(e.getMessage());;
//            }

    }
}

package teach.aistar.weekday02.Day09;

import teach.aistar.design.principle.v1.Car;

import java.util.Calendar;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/29 13:57
 */
public class StaticImportDemo {
    public static void main(String[] args) {
        Calendar instance = Calendar.getInstance();
        //静态属性才能静态导入
        int i = instance.get(Calendar.YEAR);
        System.out.println(i);
    }
}

package teach.aistar.weekday.day04;

import java.util.GregorianCalendar;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 21:06
 */
public class SwitchMaxDemo {
    public static void main(String[] args) {
        System.out.println(getMaxDay(2012,3));
    }

    private static int getMaxDay(int year, int month) {
        return switch (month){
            case 1,3,5,7,8,10,12->{yield 31;}
            case 2->new GregorianCalendar().isLeapYear(year)?29:28;
            default -> 30;
        };
    }
}

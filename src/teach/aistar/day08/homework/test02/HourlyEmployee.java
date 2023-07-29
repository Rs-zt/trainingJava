package teach.aistar.day08.homework.test02;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 17:32
 * Employee的子类，按小时拿工资的员工，
 * 属性：每小时的工资、每月工作的小时数
 * 每月工作超出160小时的部分按照1.5倍工资发放
 */
public class HourlyEmployee extends Employee{
    private double HourSalary;
    private double HourMonth;


    public HourlyEmployee(double hourSalary, double hourMonth) {
        HourSalary = hourSalary;
        HourMonth = hourMonth;
    }

    public HourlyEmployee(String name, Date birthday, double hourSalary, double hourMonth) {
        super(name, birthday);
        HourSalary = hourSalary;
        HourMonth = hourMonth;
    }

    public double getHourSalary() {
        return HourSalary;
    }

    public void setHourSalary(double hourSalary) {
        HourSalary = hourSalary;
    }

    public double getHourMonth() {
        return HourMonth;
    }

    public void setHourMonth(double hourMonth) {
        HourMonth = hourMonth;
    }
    public double getSalary(int month){
        if (getHourMonth()>160){
            return super.getSalary(getBirthday().getMonth())+((getHourMonth()-160)*1.5+160*getHourSalary());
        }else {
            return super.getSalary(getBirthday().getMonth())+getHourMonth()*getHourSalary();
        }
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("小时工");
        return sb.toString();
    }
}

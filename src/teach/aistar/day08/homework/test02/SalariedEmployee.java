package teach.aistar.day08.homework.test02;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 17:32
 * Employee的子类，拿固定工资的员工。属性：月薪
 */
public class SalariedEmployee extends Employee{
    private double MonthSalary;

    public SalariedEmployee(double monthSalary) {
        MonthSalary = monthSalary;
    }

    public SalariedEmployee(String name, Date birthday, double monthSalary) {
        super(name, birthday);
        MonthSalary = monthSalary;
    }

    public double getMonthSalary() {
        return MonthSalary;
    }

    public void setMonthSalary(double monthSalary) {
        MonthSalary =  monthSalary;;
    }
    public double getSalary(int month){
        return super.getSalary(getBirthday().getMonth())+getMonthSalary();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("固定工资的员工");
        return sb.toString();
    }
}

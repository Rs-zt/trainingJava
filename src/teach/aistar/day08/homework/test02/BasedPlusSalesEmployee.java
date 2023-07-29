package teach.aistar.day08.homework.test02;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 17:33
 * SalesEmployee的子类，有固定底薪的销售人员，
 * 工资由底薪加上销售提成部分。属性：底薪。
 */
public class BasedPlusSalesEmployee extends SalesEmployee{
    private double basicSalary;

    public BasedPlusSalesEmployee(double monthlySales, double rate, double basicSalary) {
        super(monthlySales, rate);
        this.basicSalary = basicSalary;
    }

    public BasedPlusSalesEmployee(String name, Date birthday, double monthlySales, double rate, double basicSalary) {
        super(name, birthday, monthlySales, rate);
        this.basicSalary = basicSalary;
    }

    public BasedPlusSalesEmployee(double monthlySales, double rate) {
        super(monthlySales, rate);
    }

    public BasedPlusSalesEmployee(String name, Date birthday, double monthlySales, double rate) {
        super(name, birthday, monthlySales, rate);
    }

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public double getSalary(int month){
        return super.getSalary(getBirthday().getMonth())+getBasicSalary();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("销售人员");
        return sb.toString();
    }
}

package teach.aistar.day08.homework.test02;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 17:33
 * Employee的子类，销售人员，工资由月销售额和提成率决定。
 * 属性：月销售额、提成率...
 */
public class SalesEmployee extends Employee{
    private double monthlySales;
    private double Rate;

    public SalesEmployee(double monthlySales, double rate) {
        this.monthlySales = monthlySales;
        Rate = rate;
    }

    public SalesEmployee(String name, Date birthday, double monthlySales, double rate) {
        super(name, birthday);
        this.monthlySales = monthlySales;
        Rate = rate;
    }

    public double getMonthlySales() {
        return monthlySales;
    }

    public void setMonthlySales(double monthlySales) {
        this.monthlySales = monthlySales;
    }

    public double getRate() {
        return Rate;
    }

    public void setRate(double rate) {
        Rate = rate;
    }
    public double getSalary(int month){
       return super.getSalary(getBirthday().getMonth())+getRate()*getMonthlySales();
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("SalesEmployee{");
        sb.append("monthlySales=").append(monthlySales);
        sb.append(", Rate=").append(Rate);
        sb.append('}');
        return sb.toString();
    }
}

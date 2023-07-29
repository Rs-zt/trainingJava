package teach.aistar.day08.homework.test02;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 18:11
 *
写一个程序，把若干各种类型的员工放在一个Employee数组里，
写一个函数，打印出某月每个员工的工资数额。
注意：要求把每个类都做成完全封装，不允许非私有化属性。
 */
public class EmployeeTest {
    public static void main(String[] args) {
        Employee employee = new Employee("任胜",new Date(2001-1900,5,25));
        HourlyEmployee hourlyEmployee = new HourlyEmployee("王五",new Date(2001-1900,5,25),20,100);
//        System.out.println(hourlyEmployee.getSalary(7));
        SalariedEmployee salariedEmployee = new SalariedEmployee("王五",new Date(2001-1900,5,25),5000);
//        System.out.println(salariedEmployee.getSalary(7));
        SalesEmployee salesEmployee = new SalesEmployee("王五",new Date(2001-1900,5,25),100,0.5);
//        System.out.println(salesEmployee.getSalary(7));
        BasedPlusSalesEmployee basedPlusSalesEmployee = new BasedPlusSalesEmployee("王五",new Date(2001-1900,5,25),100,0.5,3000);
//        System.out.println(basedPlusSalesEmployee.getSalary(7));
        Employee[] employees = new Employee[3];
        employees[0]=hourlyEmployee;
        employees[1]=salariedEmployee;
//        employees[2]=salesEmployee;
        employees[2]=basedPlusSalesEmployee;
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i]+"===>"+employees[i].getSalary(7));
        }
    }
}

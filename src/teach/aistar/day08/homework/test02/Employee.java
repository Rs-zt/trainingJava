package teach.aistar.day08.homework.test02;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 17:28
 * Employee：这是所有员工总的父类，
 * 属性：员工的姓名,员工的生日。Date birthday
 * 方法：getSalary(int month)
 * 根据参数月份来确定工资，
 * 如果该月员工过生日，则公司会额外奖励100元。
 */
public class Employee {
    private String name;
    private Date birthday;

    public Employee() {
    }

    public Employee(String name, Date birthday) {
        this.name = name;
        this.birthday = birthday;

    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }
    public double getSalary(int month){
        if (month==birthday.getMonth()){
            return 100;
        }else {
            return 0;
        }

    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Employee{");
        sb.append("name='").append(name).append('\'');
        sb.append(", birthday=").append(birthday);
        sb.append('}');
        return sb.toString();
    }
}

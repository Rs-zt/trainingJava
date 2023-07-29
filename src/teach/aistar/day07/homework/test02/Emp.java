package teach.aistar.day07.homework.test02;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/25 17:36
 * 二.工完成员类 Employee,需要包含员工的基本属性
 * (编号,姓名,工资)和上司以及下属,提供如下方法:
 * 属性的存/取方法
 * 业务方法包含:
 *    添加下属的方法
 *    输出自己所属下属的方法
 *    获取自己下属的人数个数.
 * ----
 * public class Emp{
 *     private int id;
 *
 *     private String name;
 *
 *     private double salary;
 *
 *     //一个上司拥有多个下属
 *     private Emp[] emps;
 *
 *     public void add(Emp e){
 *
 *
 *
 *     }
 * }
 */
public class Emp {
    private int id;

    private String name;

    private double salary;

    //上司存放下属的
    private Emp[] emp;

    public Emp() {
    }

    public Emp(int id, String name, double salary, Emp[] emp) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.emp = emp;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Emp[] getEmp() {
        return emp;
    }

    public void setEmp(Emp[] emp) {
        this.emp = emp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Emp{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", salary=").append(salary);
        sb.append(", emp=").append(Arrays.toString(emp));
        sb.append('}');
        return sb.toString();
    }

    //业务方法
    int count=0;
    public void addEmp(Emp e){
        if(emp==null){
            System.out.println("sorry,您没有权限进行添加!");
            return;
        }
        //1. 先获取上司的emp数组,进行扩容操作
        //System.out.println(this.emp);
        emp = Arrays.copyOf(emp,emp.length+1);
        emp[emp.length-1] = e;
    }

    //获取所有的下属 - 遍历emp
    public void getAllEmp(){
        if(null!=emp && emp.length>0){
            System.out.println("\t下属信息:>");
            for (Emp e : emp) {
                System.out.println("\t"+e);
            }
        }else{
            System.out.println("\tsorry,您还没任何下属!先添加!");
        }
    }

    //获取下属的个数
    public void getLen(){
        if(null!=emp && emp.length>0){
            System.out.println("\t下属的个数:"+(emp.length));
        }else{
            System.out.println("\tsorry,您还没任何下属!先添加!");
        }
    }
    //删除大于20000的下属
    public void delemp(Emp boss, Emp[] emps){
        Emp[] emps1 = new Emp[emps.length];
        for (int i = 0; i < emps.length; i++) {
            if (emps[i].getSalary()<20000){
                emps1[count]=emps[i];
                count++;
            }
        }
        emps1=Arrays.copyOf(emps1,count);
        boss.setEmp(emps1);
//        System.out.println(emps);
//        emps=Arrays.copyOf(emps,emps.length-count+1);

    }

}
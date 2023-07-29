package teach.aistar.weekday02.day07;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 18:45
 */
public class Customer {
    private int id;
    private String name;
    private int age;
    private Order[] orders;
    public Customer(){
        System.out.println("空参构造");
    }
    public Customer(int id,String cname){
        //调用本类的空参数构造
//        this();
        System.out.println("两参构造");
        this.id=id;
        this.name=cname;
    }
    public Customer(int id,String cname,int age){
        //调用本类的空参数构造
//        this();
        this(id,cname);
        System.out.println("三参构造");
        this.age=age;
//        this.id=id;
//        this.name=cname;
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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Order[] getOrders() {
        return orders;
    }

    public void setOrders(Order[] orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Customer{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", orders=").append(Arrays.toString(orders));
        sb.append('}');
        return sb.toString();
    }
}

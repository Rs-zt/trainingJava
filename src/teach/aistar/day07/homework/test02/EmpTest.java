package teach.aistar.day07.homework.test02;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/25 17:40
 *         //1. 定义一个客户
 *         Customer c = new Customer(1,"admin",30);
 *
 *         //2. 下单
 *         //模拟若干个订单
 *         Order o1 = new Order(1,"1001",300.0d,new Date());
 *         Order o2 = new Order(2,"1002",500.0d,new Date());
 *
 *         Order[] orders =  new Order[2];
 *         orders[0] = o1;
 *         orders[1] = o2;
 *
 *         //将订单数组设置到客户对象上
 *         c.setOrders(orders);
 *
 *         System.out.println(c);
 *         System.out.println("\t订单信息:");
 *         Order[] oo = c.getOrders();
 *         for (Order order : oo) {
 *             System.out.println(order);
 *         }
 */
public class EmpTest {
    public static void main(String[] args) {
        //1. 创建一个boss对象
        Emp boss = new Emp(1,"carmen",2550.0d,new Emp[0]);

        //2. 创建若干个下属
        Emp e1 = new Emp(1,"tom",1200.d,null);
        Emp e2 = new Emp(2,"jack",220.d,null);
        Emp e3 = new Emp(3,"jack",200000.d,null);

        //e1.addEmp(e2);

        boss.addEmp(e1);
        boss.addEmp(e2);
        boss.addEmp(e3);
        boss.delemp(boss,boss.getEmp());
//
        boss.getLen();
//
        boss.getAllEmp();

    }
}

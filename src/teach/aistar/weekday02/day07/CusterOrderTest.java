package teach.aistar.weekday02.day07;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 18:53
 */
public class CusterOrderTest {
    public static void main(String[] args) {
        Customer admin = new Customer(1, "admin", 30);
        //下单
        Order order = new Order(1, "1001", 300.0d, new Date());
        Order order1 = new Order(1, "1001", 300.0d, new Date());
        Order[] orders = new Order[2];
        orders[0]=order;
        orders[1]=order1;
        admin.setOrders(orders);
        System.out.println(admin);
        System.out.println("\t订单信息");
        Order[] orders1 = admin.getOrders();
        for (Order order2 : orders1) {
            System.out.println(order2);
        }
    }
}

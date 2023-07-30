package teach.aistar.weekday02.principle.dp.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 21:19
 */
public class CustomerTest {
    public static void main(String[] args) {
        //创建房地产公司
        LouPanHouse house = new LouPanHouse("碧桂园");
        Midder admin = new Midder("admin", house);
        Customer customer = new Customer(admin);
        customer.BuyHouse();
    }
}

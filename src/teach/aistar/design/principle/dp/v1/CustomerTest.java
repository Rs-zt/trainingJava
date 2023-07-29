package teach.aistar.design.principle.dp.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 16:05
 */
public class CustomerTest {
    public static void main(String[] args) {
        //创建公司
        HouseCompany louPanHouse = new LouPanHouse("碧桂园");
        //中介公司
        MiddlerCompany middler = new Middler("琪琪",louPanHouse);
        //买家
        Customer customer = new Customer(middler);
        customer.Buyhouse();
    }
}

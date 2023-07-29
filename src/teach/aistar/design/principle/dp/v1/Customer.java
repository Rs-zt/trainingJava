package teach.aistar.design.principle.dp.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 15:55
 */
public class Customer {
    //最少知道原则
    //依赖倒置原则-由维护具体到维护对象
    private MiddlerCompany middlerCompany;

    public Customer(MiddlerCompany middlerCompany) {
        this.middlerCompany = middlerCompany;
    }
    public void Buyhouse(){
        middlerCompany.displayHouse();
    }
}

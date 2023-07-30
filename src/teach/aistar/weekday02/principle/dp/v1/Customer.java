package teach.aistar.weekday02.principle.dp.v1;


/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 21:09
 */
public class Customer {
    //最少知道原则
    private MidderCompany midderCompany;
    public Customer(MidderCompany midderCompany){
        this.midderCompany=midderCompany;
    }
    public void BuyHouse(){
        midderCompany.displayHouse();
    }
}

package teach.aistar.design.principle.dp.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 15:58
 */
public class Middler implements MiddlerCompany{
    private String name;
    private HouseCompany company;

    public Middler(String name,HouseCompany company) {
        this.name = name;
        this.company=company;
    }


    @Override
    public void displayHouse() {
        System.out.println(name+"手里的房源有:"+company.houseInfo());
    }
}

package teach.aistar.weekday02.principle.dp.v1;



/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 21:14
 */
public class Midder implements MidderCompany {
    private String name;
    private HouseComany houseComany;

    public Midder(String name, HouseComany houseComany) {
        this.name = name;
        this.houseComany = houseComany;
    }

    @Override
    public void displayHouse() {
        System.out.println(name+"手上有的房源是"+houseComany.houseInfo());
    }
}

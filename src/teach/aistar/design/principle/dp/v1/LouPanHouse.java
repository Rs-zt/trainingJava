package teach.aistar.design.principle.dp.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 16:03
 */
public class LouPanHouse implements HouseCompany{
    private String name;

    public LouPanHouse() {
    }

    public LouPanHouse(String name) {
        this.name = name;
    }

    @Override
    public String houseInfo() {
        return "开发商"+name+"价格:23000元/m2";
    }
}

package teach.aistar.weekday02.principle.dp.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 21:18
 */
public class LouPanHouse implements HouseComany{
    private String name;

    public LouPanHouse(String name) {
        this.name = name;
    }

    @Override
    public String houseInfo() {
        return "开发商名"+name+"价格-3200元/m2";
    }
}

package teach.aistar.day14.homework;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/3 16:23
 */
public class Purcase {
    private String brand;
    private String name;
    private double cost;

    public Purcase() {
    }

    public Purcase(String brand, String name, double cost) {
        this.brand = brand;
        this.name = name;
        this.cost = cost;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public double getCost() {
        return cost;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Purcase{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", cost=").append(cost);
        sb.append('}');
        return sb.toString();
    }
}

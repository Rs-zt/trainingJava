package teach.aistar.day15;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 10:27
 */
public class PurcaseX implements Comparable{
    private String brand;
    private Double total;

    public PurcaseX() {
    }

    public PurcaseX(String brand, Double total) {
        this.brand = brand;
        this.total = total;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public Double getTotal() {
        return total;
    }

    public void setTotal(Double total) {
        this.total = total;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PurcaseX{");
        sb.append("brand='").append(brand).append('\'');
        sb.append(", total=").append(total);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public int compareTo(Object o) {
        PurcaseX x = (PurcaseX) o;
        return (int) (this.getTotal() - x.getTotal());
    }

}

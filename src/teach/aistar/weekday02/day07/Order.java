package teach.aistar.weekday02.day07;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 18:50
 */
public class Order {
    private int id;
    private String ordNo;
    private double price;
    private Date createDate;

    public Order() {
    }

    public Order(int id, String ordNo, double price, Date createDate) {
        this.id = id;
        this.ordNo = ordNo;
        this.price = price;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrdNo() {
        return ordNo;
    }

    public void setOrdNo(String ordNo) {
        this.ordNo = ordNo;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Order{");
        sb.append("id=").append(id);
        sb.append(", ordNo='").append(ordNo).append('\'');
        sb.append(", price=").append(price);
        sb.append(", createDate=").append(createDate);
        sb.append('}');
        return sb.toString();
    }
}

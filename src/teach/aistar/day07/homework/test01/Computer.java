package teach.aistar.day07.homework.test01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/25 16:49
 * 一.写一个描述计算机的类
 * 含如下属性:
 * 	品牌 (如 联想\DELL\IBM 等)
 * 	价格 (如 4679.8)
 * 	描述 (对计算机的描述)
 *
 * 	显示器 (显示器信息) - 自定义对象类型
 *
 * 含如下方法:
 * 	构造方法
 * 	所有属性的 getter/setter方法
 * 	提供 toString() 方法, 此方法的作用是
 * 		输出当前计算机对象的品牌\价格\描述,以及显示器的信息.
 *
 *
 * 注：
 * 针对 价格，不能低于1000, 也不能超过20000;
 * 对于超出这个值的，给一个默认值：2000
 */
public class Computer {
    private String J_brand;
    private double  price;
    private String describe;
    private Screen screen;

    public Computer() {
    }

    public Computer(String j_brand, double  price, String describe, Screen screen) {
        J_brand = j_brand;
        this.price = price;
        this.describe = describe;
        this.screen = screen;
    }

    public String getJ_brand() {
        return J_brand;
    }

    public void setJ_brand(String j_brand) {
        J_brand = j_brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        //针对 价格，不能低于1000, 也不能超过20000;
        // * 对于超出这个值的，给一个默认值：2000
        if (price>1000&&price<20000){
            this.price = price;
        } else if (price>=20000) {
            this.price=20000;
        }else {
            System.out.println("价格不能低于1000");
        }

    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public Screen getScreen() {
        return screen;
    }

    public void setScreen(Screen screen) {
        this.screen = screen;
    }

    @Override
    public String toString() {
        //提供 toString() 方法, 此方法的作用是
        // * 		输出当前计算机对象的品牌\价格\描述,以及显示器的信息.
        final StringBuilder sb = new StringBuilder("Computer{");
        sb.append("J_brand='").append(J_brand).append('\'');
        sb.append(", price='").append(price).append('\'');
        sb.append(", describe='").append(describe).append('\'');
        sb.append(", screen=").append(screen);
        sb.append('}');
        return sb.toString();
    }
}

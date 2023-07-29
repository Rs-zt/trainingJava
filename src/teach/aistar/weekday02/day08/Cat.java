package teach.aistar.weekday02.day08;

import teach.aistar.day01.Anmail;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 19:14
 */
public class Cat  extends Animal {
    private String color;

    public Cat() {
    }

    public Cat(String name,String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void spark() {
        System.out.println("喵喵");
    }
    public void catchMouce(){
        System.out.println("捉老鼠");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cat{");
        sb.append("color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

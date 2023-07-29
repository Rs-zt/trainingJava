package teach.aistar.weekday02.day08;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 19:04
 */
public class Animal {
    private String name;

    public Animal() {
    }

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //共性的方法
    public void sleep(){
        System.out.println(name+"在睡觉");
    }
    public void spark(){
        System.out.println("动物再叫");
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Animal{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

package teach.aistar.day08.TEST;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 14:27
 */
public class Animal {
    private int age;
    private String name;

    public Animal() {
        System.out.println("Animal....");
    }

    public Animal(String name,int age) {
        this.name = name;
        this.age=age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void sleep(){
        System.out.println("在睡觉");
    }
    public void spark(){
        System.out.println("哇哇叫");
    }

    public String toString(){
        return "name:==>"+name+"年龄:===>"+age;
    }
}

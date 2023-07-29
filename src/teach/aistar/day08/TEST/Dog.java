package teach.aistar.day08.TEST;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 14:28
 */
public class Dog extends Animal{
    public Dog(){
        System.out.println("dog....");
    }
    public Dog(String name,int age){
        super(name,age);
        System.out.println("super..");
    }

}

package teach.aistar.day08.TEST;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 14:28
 */
public class DogTest {
    public static void main(String[] args) {
//        Dog dog = new Dog();
        Dog dog1 = new Dog("傻狗狗",18);
//        dog.setName("傻狗");
//        System.out.println(dog1.getName());
//        System.out.println(dog.getName());
        dog1.sleep();
        System.out.println(dog1);
    }
}

package teach.aistar.weekday02.day08;

import teach.aistar.day01.dog;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 19:23
 */
public class AnimalPolyDemo {
    public static void main(String[] args) {
        /*
        * 对象编译型时类型写成父类,对象的运行是类型写成子类
        * 编译类型  对象名=new   运行时类型()
        * 编译时类型决定了队形的访问能力,-对象只能访问编译时类型的成员
        * 运行时类型决定了队形的行为能力-调用子类重写之后的方法
        *
        * */
        Animal dog=new Dog("旺财",100.0d);
        dog.spark();
        Dog d= (Dog) dog;
        d.spark();
        d.watchdoor();
        Cat cat = new Cat("咪咪", "white");
        cat.spark();
        Animal[] animals = new Animal[2];
        animals[0]=dog;
        animals[1]=cat;
        //在强制类型转换之前,需要先进行类型的判断---instanceof
        //只有返回类型true,才能够转换
        System.out.println(cat instanceof Animal);
        System.out.println(dog instanceof Animal);
        System.out.println(cat instanceof Cat);
        for (Animal animal : animals) {
            animal.spark();
            if (animal instanceof Dog){
                Dog dg= (Dog) animal;
                dg.watchdoor();
            }
            if (animal instanceof Cat){
                Cat ct= (Cat) animal;
                ct.catchMouce();
            }
        }
    }
}

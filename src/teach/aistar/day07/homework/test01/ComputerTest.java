package teach.aistar.day07.homework.test01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/25 17:25
 *  * 一.写一个描述计算机的类
 *  * 含如下属性:
 *  * 	品牌 (如 联想\DELL\IBM 等)
 *  * 	价格 (如 4679.8)
 *  * 	描述 (对计算机的描述)
 *  *
 *  * 	显示器 (显示器信息) - 自定义对象类型
 *  *
 *  * 含如下方法:
 *  * 	构造方法
 *  * 	所有属性的 getter/setter方法
 *  * 	提供 toString() 方法, 此方法的作用是
 *  * 		输出当前计算机对象的品牌\价格\描述,以及显示器的信息.
 *  *
 *  *
 *  * 注：
 *  * 针对 价格，不能低于1000, 也不能超过20000;
 *  * 对于超出这个值的，给一个默认值：2000
 *  */

public class ComputerTest {
    public static void main(String[] args) {
        Computer computer = new Computer();
        computer.setJ_brand("联想");
        computer.setPrice(500);
        computer.setDescribe("牛逼666");
        Screen screen = new Screen();
        screen.setS_brand("CRT");
        screen.setType("三星");
        screen.setSize(23);
        computer.setScreen(screen);
        System.out.println(computer.toString());
    }
}

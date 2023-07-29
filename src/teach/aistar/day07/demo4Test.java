package teach.aistar.day07;

import teach.aistar.day06.SimpleDateUtil;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/25 14:39
 */
public class demo4Test {
    public static void main(String[] args) {
        demo4 demo4 = new demo4(1,"frdfd",23);
        System.out.println(demo4);
        System.out.println(demo4.getPrice());
        demo4.setPrice(300);
        System.out.println(demo4.getPrice());
        teach.aistar.day07.demo4 d2 = new demo4(1, "rensheng", 300, SimpleDateUtil.createDate(2022,6,3));
        System.out.println(d2.getCreateDate());
//        System.out.println(SimpleDateUtil.simpleformat(d2.getCreateDate(),"yyyy-MM-dd"));


    }
}

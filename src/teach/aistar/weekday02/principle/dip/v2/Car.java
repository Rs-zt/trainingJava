package teach.aistar.weekday02.principle.dip.v2;

import teach.aistar.design.principle.v2.Vehicle;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 21:07
 */
public class Car implements Vehicle {


    @Override
    public void run() {
        System.out.println("car...");
    }
}

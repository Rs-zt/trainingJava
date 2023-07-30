package teach.aistar.weekday02.principle.crp.v2;

import teach.aistar.design.principle.v4.Screen;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 20:29
 */
public class Computer {
    private Screen screen;
    public Computer(Screen screen){
        //聚合-整体不负责局部生命
        this.screen=screen;
    }
}

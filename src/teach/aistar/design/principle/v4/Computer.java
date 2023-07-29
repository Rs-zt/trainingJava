package teach.aistar.design.principle.v4;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 15:16
 */
public class Computer {
    private Screen screen;
    public Computer(Screen screen){
        //聚合-整体不负责局部的生命
        this.screen=screen;
    }
}

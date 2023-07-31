package teach.aistar.design.principle.Fat.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 9:30
 */
public class SMSSend implements Send{
    @Override
    public void send() {
        System.out.println("短信通知...");
    }
}

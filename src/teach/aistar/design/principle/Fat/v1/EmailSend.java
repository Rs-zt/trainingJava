package teach.aistar.design.principle.Fat.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 9:30
 */
public class EmailSend implements Send{
    @Override
    public void wend() {
        System.out.println("邮箱通知>>>>>");
    }
}

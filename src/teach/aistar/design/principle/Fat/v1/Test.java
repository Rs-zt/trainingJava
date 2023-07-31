package teach.aistar.design.principle.Fat.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 9:30
 */
public class Test {
    public static void main(String[] args) {
        SendFactory factory = new SendFactory();
        Send s= factory.getInstance("SMS");
        s.wend();
        Send s1=factory.getInstance("EMAIL");

        s1.wend();
    }
}

package teach.aistar.design.principle.Fat.v5;

import teach.aistar.design.principle.Fat.v1.Send;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 18:38
 */
public class FactoryTest {
    public static void main(String[] args) {
        EmailFactory factory = new EmailFactory();
        Send s1 = factory.createSender();
        s1.send();
    }
}

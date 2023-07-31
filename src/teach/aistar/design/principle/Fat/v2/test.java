package teach.aistar.design.principle.Fat.v2;

import teach.aistar.design.principle.Fat.v1.Send;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 9:44
 */
public class test {
    public static void main(String[] args) {
        Send s=SendFactory.getInstance(SendFactory.SMS);
        Send s1=SendFactory.getInstance(SendFactory.EMAIL);
        s.send();
        s1.send();
    }
}

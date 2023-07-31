package teach.aistar.design.principle.Fat.v3;

import teach.aistar.design.principle.Fat.v1.Send;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 10:29
 */
public class Test {
    public static void main(String[] args) {
        Factory factory=new PhonehuaweiFactory();
        Send send=factory.CreateSend();
        send.wend();
        Call call = factory.CreateCall();
        call.call();
    }
}

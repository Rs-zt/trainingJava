package teach.aistar.design.principle.Fat.v3;

import teach.aistar.design.principle.Fat.v1.SMSSend;
import teach.aistar.design.principle.Fat.v1.Send;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 10:29
 */
public class PhonehuaweiFactory implements Factory{
    @Override
    public Send CreateSend() {
        return new SMSSend();
    }

    @Override
    public Call CreateCall() {
        return new QQCall();
    }
}

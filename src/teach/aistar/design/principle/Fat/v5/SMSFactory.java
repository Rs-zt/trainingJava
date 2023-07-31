package teach.aistar.design.principle.Fat.v5;

import teach.aistar.design.principle.Fat.v1.SMSSend;
import teach.aistar.design.principle.Fat.v1.Send;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 18:37
 */
public class SMSFactory implements Factory{
    @Override
    public Send createSender() {
        return new SMSSend();
    }
}

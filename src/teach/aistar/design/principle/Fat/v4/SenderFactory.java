package teach.aistar.design.principle.Fat.v4;

import teach.aistar.design.principle.Fat.v1.EmailSend;
import teach.aistar.design.principle.Fat.v1.SMSSend;
import teach.aistar.design.principle.Fat.v1.Send;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 18:34
 */
//每个方法负责创建具体的实例
public class SenderFactory {
    public static Send createSMS(){
        return new SMSSend();
    }
    public static Send createEmail(){
        return new EmailSend();
    }
}

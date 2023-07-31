package teach.aistar.design.principle.Fat.v3;

import teach.aistar.design.principle.Fat.v1.Send;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 10:26
 */
public interface Factory {
    Send CreateSend();
    Call CreateCall();
}

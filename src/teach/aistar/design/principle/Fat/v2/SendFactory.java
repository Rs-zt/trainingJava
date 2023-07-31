package teach.aistar.design.principle.Fat.v2;

import teach.aistar.design.principle.Fat.v1.EmailSend;
import teach.aistar.design.principle.Fat.v1.SMSSend;
import teach.aistar.design.principle.Fat.v1.Send;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 9:31
 */
public class SendFactory {
    //类型是安全的
    public static final String SMS="SMS";
    public static final String EMAIL="EMAIL";
    public static Send getInstance(String type){
        //定义一个接口对象
        Send send=null;
        switch (type){
            case SMS:
                send=new SMSSend();
                break;
            case EMAIL:
                send=new EmailSend();
                break;
        }
        return send;
    }
}

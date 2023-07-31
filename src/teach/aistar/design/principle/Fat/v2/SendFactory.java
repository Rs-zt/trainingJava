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
    //    实现步骤 -  根据传入的参数,来返回某个接口/类的具体的实例
    //    背后的理论: 方法的返回类型写成接口,方法的返回结果写成实现类
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

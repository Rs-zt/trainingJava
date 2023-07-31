package teach.aistar.design.principle.Fat.v1;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 9:31
 */
public class SendFactory {
    public Send getInstance(String type){
        Send send=null;
        switch (type){
            case "SMS":
                send=new SMSSend();
                break;
            case "EMAIL":
                send=new EmailSend();
                break;
        }
        return send;
    }
}

package teach.aistar.day15.prop;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 17:24
 */
public class PropDemo {
    //叫做属性文件在内存中表现形式的对象
    public static Properties prop=new Properties();
    //通过静态代码块来读取资源配置文件
    static {
        //获取文件的字节输入流
        InputStream in=PropDemo.class.getResourceAsStream("/teach/aistar/day15/prop/db.properties");
        //加载输入流
        try {
            prop.load(in);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void main(String[] args) {
        //根据key获取
        String username = prop.getProperty("username");
        String age = prop.getProperty("age");
        System.out.println(username);
        System.out.println(age);
    }
}

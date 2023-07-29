package teach.aistar.day02;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/18 15:24
 */
public class methodsdemo {
    public static void main(String[] args) {
        methodsdemo m = new methodsdemo();
        m.test();
        m.test02("任胜");
        methodsdemo.test01();
        System.out.println(methodsdemo.test03("rensheng"));

    }
    public void test(){
        test02("rssssssss");
//        test();
        test01();
        System.out.println("test......");
    }
    public static void test01(){
//        test01();
        System.out.println("test01......");
    }
    public String test02(String n){
        System.out.println(n);
        return n;
    }
    public static String test03(String b){
        return b;
    }
}

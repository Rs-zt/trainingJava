package teach.aistar.weekday02.principle.crp.v3;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 20:33
 */
public class Rootv2 {
    //合成复用原则+依赖倒置原则
    private RootV1 v;
    public Rootv2(){
        //组合替代继承的写法
        this.v=new RootV1();
    }
    public void run(){
        v.run();
        //增加二代功能
        System.out.println("会泡....");
    }
}
class RootTest{
    public static void main(String[] args) {
        Rootv2 v2 = new Rootv2();
        v2.run();
    }
}

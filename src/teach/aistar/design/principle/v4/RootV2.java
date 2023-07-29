package teach.aistar.design.principle.v4;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 15:18
 */
public class RootV2 {
    private RootV1 rootV1;
    public RootV2(){
        //组合替代继承
        this.rootV1=new RootV1();
    }
    public void run(){
        rootV1.run();
        System.out.println("会泡");
    }
}
class RootV2Test{
    public static void main(String[] args) {
        RootV2 rootV2 = new RootV2();
        rootV2.run();
    }
}

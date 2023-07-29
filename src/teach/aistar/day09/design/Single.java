package teach.aistar.day09.design;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 14:18
 */
public class Single {
    private static Single single=new Single();
    private Single(){
        System.out.println("构造块");
    }
    public static Single getSingle(){
        return single;
    }

}
class Test{
    public static void main(String[] args) {
        Sington s1=Sington.getSington();
        Sington s2=Sington.getSington();
        System.out.println(s1==s2);
    }
}

package teach.aistar.day09.design;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 14:22
 */
public class Sington {
    //懒汉模式,
    private static Sington sington=null;
    private Sington(){
        System.out.println("构造块");
    }
    public static Sington getSington(){
        return sington==null?sington=new Sington():sington;
    }
}
class Test1{
    public static void main(String[] args) {
        for (int i = 0; i < 100; i++) {
            Thread thread=new Thread(()->{
                Sington s1=Sington.getSington();
                Sington s2=Sington.getSington();
            });
            thread.start();
        }

//        System.out.println(s1==s2);
    }
}
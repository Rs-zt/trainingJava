package teach.aistar.weekday02.principle.crp.v1;


import teach.aistar.design.principle.v4.Baby;
import teach.aistar.design.principle.v4.Header;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 20:24
 * 合成复用原则
 */
public class Bady {
    //人的身体(bady)-整体
    //头-身体的部分
    private Header header;
    public Bady(){
        System.out.println("Bady...");
        this.header=new Header();
    }

}
class test{
    public static void main(String[] args) {
        Baby baby = new Baby();
    }
}

package teach.aistar.design.principle.v4;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 15:13
 */
public class Baby {
    private Header header;
    public Baby(){
        System.out.println("Bady....");
        this.header=new Header();
    }
}
class BadyTest{
    public static void main(String[] args) {
        Baby baby = new Baby();
    }
}

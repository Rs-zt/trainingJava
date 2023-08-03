package teach.aistar.day10.impents;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/2 22:22
 */
public class B implements A{
    public static void main(String[] args) {
        A b = new B();
        b.aa();
        A.bb();
        System.out.println(A.a);
    }
}

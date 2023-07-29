package teach.aistar.day10.Abstract;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 9:47
 */
public class AbstactTest {
    public static void main(String[] args) {
        Sub sub = new Sub();
        System.out.println(sub.area());
        SupAbstract supAbstract = new SupAbstract(){
            @Override
            public double area() {
                return 43433.3d;
            }

            @Override
            public double grith() {
                return 543434.5d;
            }
        };
        System.out.println(supAbstract.area());
        System.out.println((new SupAbstract() {
            @Override
            public double area() {
                return 200.9d;
            }

            @Override
            public double grith() {
                return 3333.0d;
            }
        }).grith());
    }
}

package teach.aistar.weekday.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 21:02
 */
public class SwitchDemo {
    public static void main(String[] args) {
        int n= (int) (Math.random()*3+2);
        System.out.println("n:"+n);
        switch (n){
            case 2:
                System.out.println("2....");
                break;
            case 3:
                System.out.println("3..");
            case 4:
                System.out.println("4...");
            default:
                System.out.println("default????");
        }
        System.out.println("outside..");
    }
}

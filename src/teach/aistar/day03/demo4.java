package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 14:42
 */
public class demo4 {
    public static void main(String[] args) {
        int cut=5;
        double price=10.0;
        double total= getTatil(cut,price);
        System.out.println(total);
    }

    private static double getTatil(int cut, double price) {
        if ((cut & 1) ==1){
            return cut/2*price+cut/2*price/2;
        }
        else {
            return cut/2*price+cut/2*price/2+price;
        }
    }
}

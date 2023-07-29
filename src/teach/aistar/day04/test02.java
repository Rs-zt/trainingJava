package teach.aistar.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 18:22
 */
public class test02 {
    public static void main(String[] args) {
        Binary(8);

    }
    private static void Binary(int n){
        /**
         * 8/2-----4  0
         * 4/2-----2  0
         * 2/2-----1  0
         * 1/2-----0  1
         *
         */
            String sum="";
            for (int i = n; i >0 ;) {
                sum=i%2+sum;//0
                i/=2;
            }
        System.out.println(sum);
    }
}

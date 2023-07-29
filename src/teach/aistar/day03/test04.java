package teach.aistar.day03;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/19 21:54
 */
public class test04 {
    public static void main(String[] args) {
        jie(7);
    }
    private static int jie(int n){
        int sum=1;
        int b=0;
        for (int i = 1; i <= n; i++) {
            sum*=i;
            System.out.println(i+"!="+sum);
            b+=sum;

        }
        System.out.println();
        for(int j=1;j<=n;j++) {
            if(j<n) {
                System.out.print(j+"!"+"+");
            }else {
                System.out.print(j+"!"+"=");
            }
        }
        System.out.println(b);
        return sum ;
    }
}

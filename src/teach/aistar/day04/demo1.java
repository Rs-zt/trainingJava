package teach.aistar.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 11:22
 */
public class demo1 {
    public static void main(String[] args) {
        int count=0;
        int  n=8765;
        while (true){
            n /=10;
            ++count;
            if (n==0) break;

        }
        System.out.println(count);
    }
}

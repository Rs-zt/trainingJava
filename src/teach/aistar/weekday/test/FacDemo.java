package teach.aistar.weekday.test;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/23 16:18
 */
public class FacDemo {
    public static void main(String[] args) {
        System.out.println(fei(10));
    }

    public static int  fei(int i) {
        if (i<=2)return 1;
        //定义一个变量-result-你对应位置的值
        int result=0;
        int start=1;
        int end=1;
        //从第三个位置开始
        for (int j = 3; j <=i; j++) {
            result=start+end;
            //进入下一层循环之前
            start=end;
            end=result;
        }
        return result;
    }
}

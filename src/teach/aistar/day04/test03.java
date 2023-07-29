package teach.aistar.day04;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/20 19:14
 */
public class test03 {
    public static void main(String[] args) {
        /**
         * 给定一个数字,然后逆序输出.比如12345,输出54321
         */
        Reverse(12345);
    }

    private static void  Reverse(int i) {
        String sum="";
        String a= String.valueOf(i);
        int count=0;
        boolean flag=true;
        while (flag){
            sum=sum+i%10;
            count++;
            i/=10;
            if (count==a.length())flag=false;//""+5+4
        }
        System.out.println(sum);

//        StringBuffer str = new StringBuffer(a);
//        System.out.println(str.reverse());
    }

}

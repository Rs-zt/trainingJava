package teach.aistar.weekday.day01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/22 14:14
 */
public class ForDemo {
    public static void main(String[] args) {
        for (char i = 'a'; i <'z' ; i++) {
            System.out.print(i);

        }
        System.out.println();
        for (int i = 90; i >=65 ; i--) {
            System.out.print((char) i);
        }
        System.out.println();
        for (int i = 10,j=20; i < 15&&j<=30; j+=3,i++) {
            System.out.println(i+":  "+j);
//            System.out.println(j);
        }
        //九九乘法表
        for (int i = 1; i <=9 ; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i+"*"+j+"="+i*j+"\t");
            }
            System.out.println();
        }
    }

}

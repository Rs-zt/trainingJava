package teach.aistar.day05;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/21 16:33
 */
public class demo3 {
    public static void main(String[] args) {
        char c5 = '\r';
        System.out.println("hello"+c5+"world");
        System.out.println("oo\bp");
        System.out.println("hello\tworld");
        int i= 1;
        // j = 2 + 2 = 4,     i = 1
        int j = ++i + i--;
        // w = 3 + 1 + 3 = 7
        int w = --j + i++ + j++;
        System.out.println("w:"+w);
        System.out.println((11 & 1) == 0);

        System.out.println(10 | 8); // 10

        //异或,相同为0,不同为1
        System.out.println(10 ^ 8);
    }
}

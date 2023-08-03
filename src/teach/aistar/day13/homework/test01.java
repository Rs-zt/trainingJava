package teach.aistar.day13.homework;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/3 9:43
 */
public class test01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入括号:>");
        String bracket=sc.nextLine();
        if (math(bracket)){
            System.out.println("匹配");
        }else {
            System.out.println("不匹配");
        }
    }

    private static boolean math(String bracket) {
        //将字符串打散成字符数组
        char[] chars = bracket.toCharArray();
        LinkedList<Character> list = new LinkedList<>();
        //将第一个元素压栈
        list.push(chars[0]);
        //从第二个开始遍历
        for (int i = 1; i < chars.length; i++) {
            Character c=chars[i];
            if (list.isEmpty()){
                list.push(c);
                continue;
            }
            Character top=list.getFirst();
            //判断出匹配场景
            if ((top.equals('(')&&c.equals(')'))||(top.equals('{')&&c.equals('}'))||(top.equals('[')&&c.equals(']'))){
                list.pop();
            }else {
                list.push(c);
            }

        }
        return list.isEmpty();
    }
}

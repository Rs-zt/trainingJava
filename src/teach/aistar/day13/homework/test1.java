package teach.aistar.day13.homework;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/2 16:19
 */
public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入:>");
        String str = sc.next();
//        String str="{}{}()[]";
        BracketMatch(str);
        System.out.println(BracketMatch(str));
    }
    public static boolean BracketMatch(String str){
        char[] arr=str.toCharArray();
        LinkedList<Character> list=new LinkedList<>();
        list.push(arr[0]);
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]=='('||arr[i]==')'){
                if (list.isEmpty()||arr[i]!= list.getFirst()+1){
                    list.push(arr[i]);
                }else {
                    list.pop();
                }
            }
            else {
                if (list.isEmpty()||arr[i]!= list.getFirst()+2){
                    list.push(arr[i]);
                }else {
                    list.pop();
                }
            }

        }
       return list.isEmpty();
    }
}

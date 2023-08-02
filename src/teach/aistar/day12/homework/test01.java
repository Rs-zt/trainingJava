package teach.aistar.day12.homework;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 16:32
 *
 */
public class test01 {
    public static void main(String[] args) {
        String str="ooxxoopp";
        String target="oo";
        System.out.println(delByStr(str, target));

    }
    public static String delByStr(String str,String target){
        StringBuilder sb = new StringBuilder(str);
        int startIndex = sb.indexOf(target);
        int index=target.length();
        int endIndex=startIndex+index;
        sb.delete(startIndex,endIndex);
        if (sb.indexOf(target)!=-1)
            return delByStr(sb.toString(),target);
        return sb.toString();
    }
}

package teach.aistar.weekday03.day12.homework;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 23:08
 */
public class CommonStrDemo {
    public static void main(String[] args) {
        String str1 = "abcooooopptttttkkoooooo";
        String str2 = "ooooopttttthhhoooooo";

        System.out.println(commonStr(str1, str2));
    }

    private static StringBuilder commonStr(String str1, String str2) {
        //TODO... 判断str1和str2的长度,然后可能需要交换俩个变量的值.

        //1. 找出所有子集(短),判断另外一个字符串中(长的)是否包含这个子集
        //假设str2较短.

        //核心的代码
        //1. 定义一个变量,用来保存每个子项的长度
        int len = 0;
        //2. 定义一个StringBuilder,保存公串,最后保留下来的一定是最大长度的公串
        StringBuilder sb = new StringBuilder();
        //3. 一定遍历长度较短的字符串
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i + 1; j <= str2.length(); j++) {
                //String substring(int start,int end);
                //取出所有的子项
                String subStr = str2.substring(i, j);

                //记录一下这个子串的长度
                int length = subStr.length();

                //System.out.println(subStr);
                //确定subStr是否在str1中存在
                if (str1.contains(subStr) && length > len) {
                    //清空sb清空
                    sb.delete(0, sb.length());
                    len = length;
                    sb.append(subStr + " ");
                } else if (str1.contains(subStr) && length == len) {
                    sb.append(subStr + " ");
                }
            }
        }
        return sb;
    }
}

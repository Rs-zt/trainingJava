package teach.aistar.day12.homework;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 17:44
 * firstStr: ooooooppewdfdfdfdoooooottttxsss
 * twoStr: kkkooooooifdffdxooooooxfdfdfdfddfd
 *
 * 答案是:oooooo fdfdfd
 */
public class test02 {
    public static void main(String[] args) {
        String    str1="kkkooooooifdffdxooooooxfdfdfdfddfd";
        String  str2="ooooooppewdfdfdfoooooottttxsss";
        System.out.println(PublicString(str1, str2));
    }
    public static StringBuilder PublicString(String str1, String str2){
        //判断两个字符串的长度大小
        //1找出所有子集(短),判断另外一个字符串中(长的)是否包含这个子集
        //假设str2短
        //核心代码
        //1.定义一个变量,用来保存每一个子项的长度
        int len=0;
        //2.定义一个StringBuilder.保存公串,最后保留下来的一定是最大长度的公串
        StringBuilder sb = new StringBuilder();
        //3.遍历长度较短的额字符串
        for (int i = 0; i < str2.length(); i++) {
            for (int j = i+1; j < str2.length(); j++) {
                //取出所有子项
                String str=str2.substring(i,j);
                //记录子串的长度
                int length=str.length();

                //确定str是否在str1中
                if (str1.contains(str)&&length>len){
                    //清空sb
                    sb.delete(0,sb.length());
                    len=length;
                    sb.append(str+" ");
                }else if (str1.contains(str) && length==len){
                    sb.append(str);
                }

            }

        }
        return sb;
    }
}

# 1. 字符串处理类

1. java.lang.String
2. java.lang.StringBuilder
3. java.lang.StringBuffer

# 2. String类

1. api - java.lang

2. 字符串是不可变的

   * String类是采用final修饰的 - 不可被继承

   * ***字符串想象成是字符数组(jdk8及其之前)***

     ~~~java
     private final char value[];
     ~~~

   * jdk17对字符串源码的改变很大(字节数组byte[])

     ~~~java
     @Native static final byte LATIN1 = 0;
     @Native static final byte UTF16  = 1;
     
     private final byte[] value;
     
     //默认是0,默认会优先使用 LATIN1编码
     private final byte coder;
     
     static final boolean COMPACT_STRINGS;
     
     static {
       COMPACT_STRINGS = true;
     }
     ~~~

3. 为什么要设计成不可变的

   ***优势 - 线程安全.***

## 1. 字符串的创建方式

1. 构造的方式 - new对象的方式

   ~~~java
   //创建了1个或者2个.
   
   //①只要new - 必然肯定在堆中创建了一个字符串对象 - "abc"
   //②检测常量池中是否存在"abc",没有则在串池中同样开辟区域,创建"abc"对象,如果存在,则直接复用
   String s = new String("abc");
   
   demo:
   String s1 = new String("abc");
   String s2 = new String("abc");
   System.out.println(s1 == s2);//false
   //比较的结果是false,代表指向堆里面的字符串的对象.
   ~~~

2. 串池的方式 - 字符串常量池 - jdk8.0 - 字符串常量池属于堆内部的一块区域.

   ~~~java
   String str = "abc";
   ~~~

   `串池属于"池化技术",未来还会学习到连接池,池化技术就是复用引用/对象 - 减少内存的占用 - 减少gc次数`

   ~~~java
   demo:
   //执行第一行代码,会在串池中创建一个字符串对象-"abc"
   String str2 = "abc";
   //会优先到串池中去寻找是否存在"abc"这个对象,如果存在,直接将已经存在的字符串的对象的地址赋值给str1
   String str1 = "abc";
   System.out.println(str2 == str1);//true
   ~~~

## 2. 拼接的性能对比

String和StringBuilder进行对比

1. jdk8.x

   ~~~java
   /**
    * 本来用来演示: String拼接效率低于StringBuilder
    *
    * @author success
    * @date 2023/8/1 10:08:42
    */
   public class StringTest {
       public static void main(String[] args) {
          testStringBuilder();//13ms
   
          testStr();//18556ms
       }
   
       //String => +
       public static void testStr(){
           long t1 = System.currentTimeMillis();
   
           String str = "";
   
           for (int i = 0; i < 100000; i++) {
               str+=i;//str = str + i;
           }
   
           System.out.println("消耗了:"+(System.currentTimeMillis()-t1)+"ms");
       }
   
       // StringBuilder => append
       public static void testStringBuilder(){
           long t1 = System.currentTimeMillis();
   
           StringBuilder sb = new StringBuilder();
   
           for (int i = 0; i < 100000; i++) {
              sb.append(i);
           }
   
           System.out.println("消耗了:"+(System.currentTimeMillis()-t1)+"ms");
       }
   }
   ~~~

2. jdk17里面的String的+拼接

   `已经很大程度优化了字符串的拼接的性能.`

## 3. 剖析jdk8 - 拼接性能低原因  

`分析 - 每次进行String类型的+操作的时候,都会在底层新建一个StringBuilder对象-导致效率降低`

~~~java
public class StringDemo{
   public static void main(String[] args){
	      String s = "a";
        s+="b";//s = s + "b";//根据下面的指令
               //s = new StringBuilder().append(s).append("b").toString();
        s+="c";//s = s + "c";//new StringBuilder().append(s).append("c").toString();
   }
}
~~~

~~~java
public static void main(java.lang.String[]);
    Code:
       0: ldc           #2                  // String a
       2: astore_1
       3: new           #3                  // class java/lang/StringBuilder
       6: dup
       7: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
      10: aload_1
      11: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      14: ldc           #6                  // String b
      16: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      19: invokevirtual #7                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      22: astore_1
      23: new           #3                  // class java/lang/StringBuilder
      26: dup
      27: invokespecial #4                  // Method java/lang/StringBuilder."<init>":()V
      30: aload_1
      31: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      34: ldc           #8                  // String c
      36: invokevirtual #5                  // Method java/lang/StringBuilder.append:(Ljava/lang/String;)Ljava/lang/StringBuilder;
      39: invokevirtual #7                  // Method java/lang/StringBuilder.toString:()Ljava/lang/String;
      42: astore_1
      43: return
}
~~~



## 4. 为什么从char[]=>byte[]

目的:减少内存的占用,减少gc次数

> ~~~java
> @Native static final byte LATIN1 = 0;
> @Native static final byte UTF16  = 1;
> 
> //存储字符串的字节数组,操作byte[]肯定比操作char[]更快
> private final byte[] value;
> 
> //标志位 - 默认是0,默认采用LATIN1(拉丁文编码) - iso-8859-1
> private final byte coder;
> 
> //默认是开启 "紧凑字符串"
> static final boolean COMPACT_STRINGS;
> 
> static {
>   COMPACT_STRINGS = true;
> }
> ~~~
>
> `回忆`
>
> 1. unicode - 字符集,包括ascii码
> 2. utf8(可变),utf16(可变),utf32(固定)都是属于unicode字符集的编码方式

---

> ~~~java
> //统计 - 字符串在项目中大概率是用来存储latin1字符集的
> String name = "jack";//字母,数字,符号都是占用1个字节.
> 
> 在jdk8的时候,字符串使用的char[],  char不管你是字母还是汉字,都是占用2个字节.
>   
> 使用byte[]进行字符串的存储,减少一半的空间.
>   
> String name="中文";//jdk17下,根据内容,是否在latin1范围之内,如果不在,则采用utf-16编码
> ~~~
>
> `为什么不用utf-8.utf-16`
>
> utf-8保存一个字符,可能是1个字节,可能是2个,可能是3,可能是4个,可能是5个,可能是6个...
>
> 单个字节  0XXXXXXXX
>
> 两个字节  110XXXXX 10XXXXXX
>
> 三个字节  1110XXXX  10XXXXXX 10XXXXXX
>
> 观察第一位,如果是数字0,表示单个字节.
>
> `但是utf16可能是占2个,可能是4个`,但是在java的世界中,占4个意思(由2个char组成) - "认为utf16是固定的"
>
> 字符串是支持随机访问(允许通过下标访问,允许通过下标来截取) - 肯定固定长字节***,查找效率更高一点***.

---



# 3. 正则表达式

https://tool.oschina.net/regex/

1. 表达式符号

   [a-z] => 字母a-z当中的任意1个

   [0-9]=>数字0-9当中的任意1个

   \d => 和[0-9]是一样的,  \D非数字

   [A-Z] => 字母A-Z当中的任意1个

   [a-z0-9] => 代表字母a-z或者数字0-9当中的任意1个

   [a-z0-9A-Z_] => 代表字母或者数字或者下划线当中的任意一个.

   \w 等同于[a-z0-9A-Z_]

   \s 空格 tab 换行

   \S 非空白字符

   . 任意字符

2. 量词

   ~~~java
   * 代表出现的次数是0次或者多次,   比如 [0-9]*   
   + 1次或者多次
   ? 0次或者1次
     
   {m} 正好出现m次
   {m,} 至少出现m次
   {m,n} 出现的次数在[m,n]之间
   ~~~


# 4. 作业

1. 删除原字符串中的指定字符串

   ~~~java
   public static String delByStr(String str,String target){
       //return str.replaceAll(target,"");
     
     return delByStr(sb.toString,target);
   };
   
   String result = delByStr("ooxxoopp","oo");
   result=> xxpp
     
   思路:
   1. str=>StringBuilder      StringBuilder sb = new StringBuilder(str);
   
   //递归出口,判断str是否还包含target
   
   2. 找出target第一次出现的位置  int startIndex = sb.indexOf(target);
      算出结束的下标endIndex
        
   3. StringBuilder delete(int startIndex,int endIndex);
   
   4. 递归调用自己
   ~~~

2. 找出俩个字符串的最大长度的公串

   ~~~java
   firstStr: ooooooppewdfdfdfdoooooottttxsss
   twoStr: kkkooooooifdffdxooooooxfdfdfdfddfd
     
   答案是:oooooo fdfdfd
   ~~~


> java8.x之前提供了两种关于日期类型的处理,当然jdk8.x新增了一些关于日期处理的api.
>
> 1. java.util.Date - 日期处理类,大部分的方法是过时的.
> 2. java.util.Calendar - 日历处理类,用来替代Date使用的.

---



# 2. Date日期类型

> api手册中
>
> 1. 看方法 - 静态方法直接使用类调用,非静态方法使用对象调用.
>
> 2. 如何创建对象 - api手册的构造方法 - 使用new关键字.
>
>    `1. 构造方法的名称和类名一致`
>
>    `2. 构造方法允许重载`

---

> 构造方法
>
> 1. 仅有俩个没有过时
>
>    * Date();//获取当前系统的日期
>    * Date(long time);//根据指定的毫秒数来构建指定的日期对象
>
> 2. 已经弃用 - 过时的
>
>    * Date(int year,int month,int date);//根据指定的年月日来构建指定的日期对象
>      1. year-1900
>      2. month的范围是[0,11]
>
>    * Date(int year,int month,int date,int hours,int minutes,int seconds);//根据指定的年月日时分秒来构建指定的日期对象.

---

> 普通方法
>
> 1. long getTime();//获取日期的毫秒数
> 2. int getXXX();//XXX可以是年月日时分秒,注意Day[周几,周日是返回0]
> 3. void setXXX(int n);//设置日期字段的值.
> 4. void setTIme(long date);//根据指定的毫秒数来重新设置Date的字段值.

---

> `总结`
>
> 1. Date类型如何转成long毫秒数
>    * long getTime()
> 2. long毫秒数来转换Date类型值
>    * 利用构造Date(long time);
>    * 利用方法void setTime(long date);

---



# 3. Calendar日历类

> `源码`
>
> ~~~java
> public abstract class Calendar implements Serializable, Cloneable, Comparable<Calendar> {
>   //...
> }
> ~~~
>
> abstract定义的类-`抽象类` - 不能够被实例化[不能够被new],**也就说明不能这样去创建对象**
>
> ~~~java
> Calandar cal = new Calendar();
> ~~~

## 1. 创建日历对象

1. static Calendar getInstance();

   ~~~java
   Calendar cal = Calendar.getIntance();
   ~~~

`分析一下源码getInstance`

~~~java
public static Calendar getInstance(){
  Locale aLocale = Locale.getDefault(Locale.Category.FORMAT);
  return createCalendar(defaultTimeZone(aLocale), aLocale);
}
~~~

`接着看createCalendar方法的底层 - 核心的代码`

~~~java
private static Calendar createCalendar(TimeZone zone,Locale aLocale){
   //..
  Calendar cal = null;
  
  //..
   cal = switch (caltype) {
     case "buddhist" -> new BuddhistCalendar(zone, aLocale);
     case "japanese" -> new JapaneseImperialCalendar(zone, aLocale);
     case "gregory"  -> new GregorianCalendar(zone, aLocale);
     default         -> null;
   };
  
  //...
  
  return cal;
}
~~~

~~~java
假设 - cal = new GregorianCalendar(zone, aLocale);

//父类 对象 = new 子类();
补全: Calendar cal = new GregorianCalendar(zone, aLocale);
~~~

`GregorianCalendar.java源码`

~~~java
//GregorianCalendar继承Calendar.
//暂时 - Calendar(父类 - 爸爸),GregorianCalendar(子类 - 儿子)
public class GregorianCalendar extends Calendar {....}
~~~

## 2. 关于静态字段

> 也叫静态域... 静态属性 - 全部变量
>
> static修饰的全局变量 - 静态域

## 3. final关键字

> 1. final修饰的变量 - 常量 - 不可改变
> 2. final修饰的属性 - 常量属性 - 不可改变
> 3. final和static一起修饰的属性 - 公开的静态的常量属性
> 4. 常量/常量属性都是推荐使用大写字母,如果存在多个单词,那么多个单词之间使用_隔开.
> 5. 优势 - 见名知意

---

## 4. 常用方法

> 1. int get(int field);//根据给定的参数来获取日历指定的字段值.
> 2. void set(int field,int value);//将指定的value设置到日历指定的字段上去.
> 3. void set(int year,int month,int date);//通过指定的年月日来设置日历的值.
> 4. Date getTime();//返回日历信息中的关于日期字段的中=>   Calendar类型转换Date类型
> 5. void setTime(Date d);//通过Date来设置日历,Date类型=>Calendar类型

---



# 4. 日期的格式化

> api:java.text.SimpleDateFormat

## 1. 构造方法

> SimpleDateFormat(String pattern);//利用一个合法的日期的字符串模板来构建日期格式化的对象

## 2. 常用的方法

1. String format(Date d);//将日期格式化成日期/时间字符串

   日期转成指定格式的字符串

2. Date parse(String strDate);//指定格式的字符串转换成指定格式的日期



# 5. 获取键盘输入

> api:java.util
>
> 类:Scanner

## 构造

> Scanner(InputStream in)

## 常用的方法

1. int nextInt();//只能获取整数
2. double nextDouble();//只能获取小数
3. String nextLine();//获取字符串

---

`注意点`

1. 如果使用nextInt或者nextDouble获取了非法的字符,一定会抛出java.util.InputMismatchException - 输入不匹配异常.

2. 在调用nextLine调用之前千万不要调用nextInt或者nextDouble,否则会导致nextLine失效.

   如果先调用nextLine是没有问题的.

3. 推荐直接使用nextLine - **后期会学习String和int类型或者double类型之间的转换.**

---

`分析一下注意点发生的原因:`

~~~java
Scanner sc = new Scanner(System.in);
System.out.print("请输入a:>");
int n = sc.nextInt();
System.out.println("n:"+n);
~~~

`控制台输出`

~~~java
请输入a:>10
n:10
~~~

`nextInt明显换行了 - 没有接受\n符号 - 只能接受整数`

~~~java
package tech.aistar.day06;

import java.util.Scanner;

/**
 * 本来用来演示:
 *
 * @author success
 * @date 2023/7/25 09:48:47
 */
public class ScannerTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("请输入a:>");
        int n = sc.nextInt();
        System.out.println("n:"+n);

        //如果非要nextInt调用完之后使用nextLine,为了避免真正的nextLine失效
        //可以多写一个nextLine来处理一下\n
        sc.nextLine();

        System.out.print("输入字符串:>");
        //其实它没有失效,只是接受完毕了,接受到了nextInt没有处理的\n
        String line = sc.nextLine();
        System.out.println("line:"+line);
    }
}
~~~

---






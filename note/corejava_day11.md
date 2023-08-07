# 1. 多态的应用

1. 面向父类编程
2. 面向接口编程
   * 对象的编译时类型写成接口,对象的运行时类型写成实现类
   * ***方法的返回类型写成接口,方法的返回结果写成实现类***
   * 方法的参数列表写成接口,可以传入接口的实现类.

# 2. 简单工厂设计模式

并不属于23种设计模式

目的:将对象的创建和对象的使用进行分离.  对象的创建统一交给工厂去完成.

传统的模式: IUserDao userDao = new UserDaoImpl();//主动寻找,主动场景.

部分对象的创建可能步骤比较复杂,甚至可能需要消耗一定的时间.让使用者无需关心对象创建的过程.

## 1. 版本一

根据传入的参数,来返回某个接口/类的具体的实例

~~~java
package tech.aistar.design.factory.v1;

/**
 * 本来用来演示: 简单工厂
 *
 * @author success
 * @date 2023/7/31 09:20:15
 */
public class SenderFactory {

    //    实现步骤 -  根据传入的参数,来返回某个接口/类的具体的实例
    //    背后的理论: 方法的返回类型写成接口,方法的返回结果写成实现类

    public Sender getInstance(String type){
        //定义一个接口对象
        Sender sender = null;

        switch (type){
            case "SMS":
                sender = new SMSSender();
                break;
            case "EMAIL":
                sender = new EmailSender();
                break;
        }
        return sender;
    }
}
~~~

`弊端 - 1. 还需要去创建工厂对象  2. 参数不可控的,可能会传入一个非参数-导致工厂场景对象失败!`



## 2.  版本二 - 笔试推荐

> 总结:
>
> 优点 - 简单/结构
>
> 缺点 - 每次如果新增一个产品,那么对于工厂类来说 - 越无能为力 -  **工厂类会违背开闭原则.**
>
> ***新增产品 - 需要修改工厂类***

> ~~~java
> package tech.aistar.design.factory.v2;
> 
> import tech.aistar.design.factory.v1.EmailSender;
> import tech.aistar.design.factory.v1.SMSSender;
> import tech.aistar.design.factory.v1.Sender;
> 
> /**
>  * 本来用来演示: 简单工厂
>  *
>  * @author success
>  * @date 2023/7/31 09:20:15
>  */
> @SuppressWarnings("all")
> public class SenderFactory {
>     //类型是安全的
>     public static final String SMS = "SMS";
>     public static final String EMAIL = "EMAIL";
>     
>     public static Sender getInstance(String type){
>         //定义一个接口对象
>         Sender sender = null;
> 
>         switch (type){
>             case SMS:
>                 sender = new SMSSender();
>                 break;
>             case EMAIL:
>                 sender = new EmailSender();
>                 break;
>         }
>         return sender;
>     }
> }
> ~~~

## 3. 多方法工厂

~~~java
package tech.aistar.design.factory.v3;

import tech.aistar.design.factory.v1.EmailSender;
import tech.aistar.design.factory.v1.SMSSender;
import tech.aistar.design.factory.v1.Sender;

/**
 * 本来用来演示: 简单工厂设计模式 - 多方法工厂
 *
 * 一个方法负责创建具体的实例
 *
 * @author success
 * @date 2023/7/31 09:53:35
 */
public class SenderFactory {

    public Sender createSMS(){
        return new SMSSender();
    }

    public Sender createEmail(){
        return new EmailSender();
    }
}
~~~



## 4. 多静态方法工厂

~~~java
public class SenderFactory {

    public static Sender createSMS(){
        return new SMSSender();
    }

    public static Sender createEmail(){
        return new EmailSender();
    }
}
~~~



# 3. 工厂方法设计模式

真正属于23种GOF

目的 - 一个工厂只负责创建一个产品 - 设计的目的是为了让工厂类符合开闭原则.

缺点: 导致项目中产生大量的工厂类 - 维护大量的工厂类.

优点: 减轻单个工厂的压力,使得工厂类符合开闭原则



# 4. 抽象工厂设计模式

1. 客户端(使用者)并不知道具体有多少个产品被设计出来了.
2. 把同一个产品族的产品设计在一起,保证客户端使用的就是同一个产品族中的产品.
3. 抽象工厂也是符合开闭原则.

---



# 5. 函数式接口

函数式接口(使用@FunctionalInterface修饰) - 这个接口只能有一个抽象方法.

一旦是函数式接口,可以采用lambda表达式[jdk8.0新特性]来替代匿名内部类的写法



# 6. java.lang.Object

> Object是所有类的根类,父类,基类.一个类如果明确指定它的父类,那么默认就是继承Object
>
> 接口并不继承Object

----

1. Class<?> getClass();//获取运行时类型 - 学习反射技术(学习框架的基础) - java.lang.Class<T>学习反射技术基础的类.

2. String toString();//默认打印的是对象的内存地址,一般是需要重写来满足实际的打印需求.

3. **public boolean equals(Object obj);//基本类型比较使用==,对象类型比较使用equals.**

   ~~~java
   Object:
   public boolean equals(Object obj) {
     return (this == obj);
   }
   ~~~

4. **public native int hashCode();**

5. **protected native Object clone() throws CloneNotSupportedException;//克隆方法**

6. notify()和notifyAll(),wait()

## 1. equals方法

重写步骤

1. 非空性
2. 自反性
3. 类型一致性
4. 定制比较的规则

---

## 2. hashCode方法

> 该方法是可以不提供的,并不影响equals比较的结果,但是提供之后,**可以有效提高效率.**
>
> 起始质数是31 - 减少哈希冲突/碰撞.
>
> 哈希桶,桶数组,哈希算法,哈希碰撞/哈希冲突.
>
> 1. 桶数组 - 根据哈希算法得到一个哈希值,根据哈希值就可以得到一个地址/下标
> 2. 哈希冲突 - 俩次得到的哈希值是一样的.

---

1. 不同对象的hash值可能是一样 - 哈希冲突/碰撞
2. equals返回true的俩个对象,一定是同一个对象.

---

## 3. 面试==和equals区别

1. == 

   **基本类型使用**==比较值,对象类型使用==比较的是地址.

2. equals

​		**对象类型**采用equals进行比较,默认使用的是Object中的(==),一般需要重写equals

---

## 4. clone方法

> 优势 - 比自己new性能高,因为它不走构造方法,直接在内存中进行复制

1. 浅层克隆 - 浅拷贝 - 浅复制

使用Object中的clone - 浅拷贝 ,由于Object中的clone方法使用protected修饰的.因此需要重写clone方法,修改成public.

特点:

1. 对于基本数据类型以及String或者Date,复制的就是值
2. 对于引用类型,复制的地址.

```java
//1. 修改原对象的基本数据类型,String,Date类型都不会对副本对象产生影响
//2. 修改对象类型,会对副本对象造成影响
```

2. 深层克隆 - 深拷贝 - 深复制

将原型对象的无论是基本数据类型还是引用数据类型全部拷贝一份给副本.修改原型对象,都不会对副本对象造成影响.

~~~java
需要手写clone方法,然后将原型对象中的每个属性值,都要手动一一赋值到新new出来的对象.
~~~

## 6. 原型模式

一个对象的产生可以不由零起步，直接从一个已经具备一定雏形的对象克隆，然后再修改为生产需要的对象。

用一个已经创建的实例作为原型,通过复制该原型对象来创建一个和原型对象相同的新对象

使用场景:

1. 对象的创建非常复杂,可以使用原型模式来快速创建对象
2. 性能和安全要求得到提高.

---

> ~~~java
> Email email = new Email();
> email.setFrom("发送者邮箱");
> email.setTitle("邮箱的标题");
> email.setText("邮箱的正文");
> 
> for(int i=0;i<10;i++){
>   Email copy = (Email)email.clone();
>   //邮箱只是收件地址不一样滴!
>   copy.setTo("aistar"+i+"@it.com");
>   mailSender.send(copy);
> }
> ~~~

---

## 7. finalize() 

> protected void finalize() throws Throwable { },过时的方法
>
> 一般不会自己调用的.  
>
> 1. GC只能回收new出来的对象.
> 2. 当GC回收一个垃圾对象之前,会先调用这个对象的finalize() , 进行资源,空间,内存等等一些释放的动作.

---

笔试题:   final和finally以及finalize三者之间的区别.

---



# 7. Integer包装类型💯

> **int=>Integer**,byte=>Byte,short=>Short,long=>Long,float=>Float,double=>Double,boolean=>Boolean,**char=>Character**

1. api: java.lang
2. 是int类型的包装类型,本身属于对象类型.  可以把基本数据类型作为对象来操作.
3. 抽象的父类java.lang.Number - 直接的子类Byte,Short,Integer,Long,Float,Double

## 1. 构造方法

1. Integer(int value);//利用基本数据类型构建Integer类型,基本数据类型int=>包装类型Integer
2. Integer(String s);//字符串必须数字形式的字符串,String类型转成Integer类型,如果传入的是一个非法的字符串,抛出java.lang.NumberFormatException异常 - 数字格式化失败的异常.

## 2. 常用方法

1. int intValue();//Interget类型转换成int类型
2. static Integer valueOf(int n);//将基本类型转换成Integer类型
2. static Integer valueOf(String n);//String=>Integer
2. static int parseInt(String s);//将数字形式的字符串转换成int,如果字符串是非法的,抛出java.lang.NumberFormatException
2. String toString();//将Integer=>String
2. 进制相关的方法
2. 常量

## 3. 剖析valueOf方法的底层

> 结论:
>
> ~~~java
> //结论: 只要值在[-128,127]之间,使用==比较的结果就是true.
> Integer v1 = Integer.valueOf(-128);
> Integer v2 = Integer.valueOf(-128);
> System.out.println(v1 == v2);
> ~~~
>
> 源码:
>
> ~~~java
> public static Integer valueOf(int i) {
>   if (i >= IntegerCache.low && i <= IntegerCache.high)
>     return IntegerCache.cache[i + (-IntegerCache.low)];
>   return new Integer(i);
> }
> 
> //Integer内部的缓存机制
> //静态内部类
> private static class IntegerCache {
>     static final int low = -128;
>   
>     static final int high;
>     
>     //缓存数组
>     static final Integer[] cache;
>   
>     static{
>        int h = 127;
>       
>        ...
>        //缓存数组的大小
>        int size = (high - low) + 1;
>          
>        high = h;
>       
>       //对缓存数组进行初始化
>       if (archivedCache == null || size > archivedCache.length) {
>         Integer[] c = new Integer[size];//存放了256个数据
>         
>         int j = low;//low=-128
>         for(int i = 0; i < c.length; i++) {
>           //c数组存储了[-128,127]之间的数据
>           c[i] = new Integer(j++);
>         }
>         archivedCache = c;
>       }
>       cache = archivedCache;
>     }
>  }
> ~~~

## 4. 查看jvm指令

> ~~~java
> public class IntegerDemo{
>    public static void main(String[] args){
>        Integer m1 = 128;
>        Integer m2 = 128;
>        System.out.println(m1 == m2);
>    }
> }
> ~~~

> javac IntegerDemo.java
>
> javap -c IntegerDemo
>
> ~~~java
> admindeMacBook-Pro:Desktop admin$ javap -c IntegerDemo
> Compiled from "IntegerDemo.java"
> public class IntegerDemo {
>   public IntegerDemo();
>     Code:
>        0: aload_0
>        1: invokespecial #1                  // Method java/lang/Object."<init>":()V
>        4: return
> 
>   public static void main(java.lang.String[]);
>     Code:
>        0: sipush        128
>        3: invokestatic  #7                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
>        6: astore_1
>        7: sipush        128
>       10: invokestatic  #7                  // Method java/lang/Integer.valueOf:(I)Ljava/lang/Integer;
>       13: astore_2
>       14: getstatic     #13                 // Field java/lang/System.out:Ljava/io/PrintStream;
>       17: aload_1
>       18: aload_2
>       19: if_acmpne     26
>       22: iconst_1
>       23: goto          27
>       26: iconst_0
>       27: invokevirtual #19                 // Method java/io/PrintStream.println:(Z)V
>       30: return
> }
> ~~~



## 5. 笔试-Integer和int的区别

> 1.Integer是int的包装类，int则是java的一种基本的数据类型；
>
> 2.Integer变量必须实例化之后才能使用，而int变量不需要实例化；
>
> 3.Integer实际是对象的引用，当new一个Integer时，实际上生成一个指针指向对象，而int则直接存储数值
>
> 4.Integer的默认值是null，而int的默认值是0。

---

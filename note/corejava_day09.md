# 1. static关键字作用

1. 静态导入 - 不怎么使用

   ~~~java
   import static java.util.Calendar.YEAR;
   ~~~

2. 静态的方法没有多态

   ~~~java
   public class StaticPolyDemo {
       public static void main(String[] args) {
           Sup sub = new Sub();
           //也是可以使用对象去调用静态方法.
           sub.test();//Sup...
   
           //属性是没有重写的概念 - 拿到的就是父类中的实例变量 - 成员变量
           System.out.println(sub.a);//10
       }
   }
   class Sup{
       public int a = 10;
       public static void test(){
           System.out.println("Sup..");
       }
   }
   class Sub extends Sup{
       public int b = 100;
       //但是static修饰的方法不允许重写 - 静态方法不允许重写
       //@Override
       public static void test(){
           System.out.println("Sub...");
       }
   }
   ~~~

3. static可以修饰哪些东西?

   * static修饰的属性 - 静态属性
   * static修饰的方法 - 静态方法
   * static修饰的代码块 - 静态代码块

4. static修饰的成员分配空间和初始化的时机 - 类一旦被加载,就会立即对静态成员分配空间和初始化,**并且只会分配空间和初始化一次**.

   只要类在内存中,static修饰的成员就会一直在内存中 - 不会被回收.

5. 普通代码块和构造块 - 执行的时机 - 每次new对象的时候,都会执行普通代码块和构造块,但是普通代码块的执行时机高于构造块.



# 2. 静态变量和实例变量区别

1. 实例变量 - 普通属性 - 非静态属性
   * 实例变量是属于对象的
   * 只要每次创建新的对象,都会对这个对象中的实例变量分配空间和初始化.
2. 静态变量 - 静态属性
   * 静态属性是属于类的
   * 一旦类加载之后,立即对静态属性分配空间和初始化,**并且时机只有一次**
   * 静态属性在内存中永远只有一份 - 和创建了多少个对象是无关的.
   * 静态属性是该类下的对象所共享的.

---

# 3. jvm加载类进内存的活动过程

1. jvm加载类

2. 给所有的静态属性分配空间和初始化

3. 给所有的静态方法分配空间和初始化

4. 调用静态代码块 - 应用 - 程序启动的时候,一些比较费时间并且只要执行一次的代码,比如读取资源配置文件.

5. 如果创建了对象

   5-1. 给所有的非静态属性分配空间和初始化

   5-2. 给所有的非静态方法分配空间和初始化

   5-3. 调用普通代码块

   5-4. 调用构造块

---

# 4. 静态内部类

> 静态内部类 - 成员内部类 - 局部内部类 - ***匿名内部类***

static同样可以修饰类,通常作为外部类的静态内部类使用 - 方便读取jdk源码.

内部类的优势 - 直接可以使用外部类的成员.

~~~java
package tech.aistar.day09;

/**
 * 本来用来演示: 静态内部类
 *
 * @author success
 * @date 2023/7/27 11:23:16
 */
public class StaticOuter {
    private int id = 10;
    private int sid = 10;

    private static int guid = 100;

    //静态内部类
    public static class StaticInner{
        private int id = 20;
        private static int guid = 200;

        public void test01(){
            //访问内部类自己的属性
            System.out.println("inner-id:"+id);
            System.out.println("inner-guid:"+guid);
            System.out.println("outer-guid:"+StaticOuter.guid);
            //System.out.println("outer-id:"+StaticOuter.this.id);
            System.out.println("outer-id:"+new StaticOuter().id);
        }

        public static void test02(){
            //System.out.println("inner-id:"+id);
            System.out.println("inner-guid:"+guid);
            System.out.println("outer-guid:"+StaticOuter.guid);

        }
    }
}
class TestStaticInner{
    public static void main(String[] args) {
        //创建静态内部类对象
        StaticOuter.StaticInner s = new StaticOuter.StaticInner();
        s.test01();
    }
}
~~~



# 5. 设计模式 - 单例模式

`单例模式 - 保证一个类的具体的实例在整个应用程序中只有唯一的一个`.

`哪些类应该要设计成单例的? - 构建这个类比较复杂,比较耗时!  这个类比较吃内存!` - 连接池对象.

1. 私有化构造
2. 提供这个类的唯一(静态)实例
3. 提供一个公开的静态的方法来返回这个唯一实例

## 1. 饿汉模式

***单线程/多线程场景下都是属于线程安全的.***

~~~java
package tech.aistar.design.singleton.v1;

/**
 * 本来用来演示: 饿汉模式
 *
 * @author success
 * @date 2023/7/27 14:04:42
 */
public class Singleton {
    //2. 提供这个类的唯一(静态)实例
    //只会赋值一次
    private static Singleton instance = new Singleton();

    //1. 私有化构造
    private Singleton(){
        System.out.println("构造块~");
    }

    //3. 提供一个公开的静态的方法来返回这个唯一实例
    public static Singleton getInstance(){
        return instance;
    }
}
class SingletonTest{
    public static void main(String[] args) {
        //获取它的实例
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
~~~

## 2. 懒汉模式 - 线程非安全

在单线程环境下是Ok的,但是在多线程环境下是不OK,无法在多线程环境下保证它还是一个单例的.

~~~java
package tech.aistar.design.singleton.v2;

/**
 * 本来用来演示: 懒汉模式
 *
 * @author success
 * @date 2023/7/27 14:11:59
 */
public class Singleton {

    //懒汉模式 - 加载Singleton的时候,并没有立即将类的实例赋值给instance
    private static Singleton instance = null;

    private Singleton(){
        System.out.println("构造块~");
    }

    //懒汉 - 谁先调用getInstance,那么才会去对instance进行初始化/赋值
    public static Singleton getInstance(){
        return instance==null?instance = new Singleton():instance;
    }

}
class SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        System.out.println(s1 == s2);
    }
}
~~~

## 3. 剖析线程不安全

~~~java
class SingletonTest{
    public static void main(String[] args) {
//        Singleton s1 = Singleton.getInstance();
//        Singleton s2 = Singleton.getInstance();
//        System.out.println(s1 == s2);

        //模拟一个多线程的场景
        for (int i = 0; i < 100; i++) {
            Thread t = new Thread(()->{
                Singleton s1 = Singleton.getInstance();
            });
            t.start();
        }
    }
}
~~~

`测试结果`

> 构造块~
> 构造块~
> 构造块~
> 构造块~
> 构造块~
> 构造块~
> 构造块~
> 构造块~
> 构造块~
> 构造块~
> 构造块~

---

`解决方案 - 加同步锁`

## 4. 懒汉模式 - 线程安全

使用同步锁 - synchronized

~~~java
package tech.aistar.design.singleton.v3;

/**
 * 本来用来演示: 懒汉模式
 *
 * @author success
 * @date 2023/7/27 14:11:59
 */
public class Singleton {

    //懒汉模式 - 加载Singleton的时候,并没有立即将类的实例赋值给instance
    private static Singleton instance = null;

    private Singleton(){
        System.out.println("构造块~");
    }

    //1000个线程要想进入getInstance方法内部执行的前提是哪个线程"抢到这个锁资源".
    //哪个线程抢到,就由哪个线程进去执行,其他没有抢到锁资源的线程就会等待阻塞.
    //直抢到锁资源的线程全部执行完毕之后 - 才会释放这把"锁",其余线程才会继续抢锁.
    public static synchronized Singleton getInstance(){

        return instance==null?instance = new Singleton():instance;
    }

}
class SingletonTest{
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(()->{
                Singleton s = Singleton.getInstance();
            });
            t.start();
        }
    }
}

~~~

## 5. 懒汉模式(线程安全)和饿汉的模式对比

1. 线程安全性方面

   饿汉模式 - 单线程/多线程 - 都是线程安全的 - 因为类加载的时候(线程对象还不存在!),就会初始化那个单例的实例.

   懒汉模式 - 需要通过加锁的方式,来实现多线程安全.

2. 效率方面 - 懒汉模式通常是需要加锁的,所以涉及到频繁加锁和释放锁的动作,而"锁"也是一个比较昂贵的资源对象[占内存]

   效率不如饿汉模式.

3. 占内存方面 - 饿汉模式比较占内存 - 类加载的时候,它在内存中就存在了.  懒汉模式是你需要使用它实例的时候,它才会第一次实例化.



## 6. 双重检测锁-笔试/面试

~~~java
package tech.aistar.design.singleton.v4;

/**
 * 本来用来演示: 懒汉模式
 *
 * @author success
 * @date 2023/7/27 14:11:59
 */
public class Singleton {

    //懒汉模式 - 加载Singleton的时候,并没有立即将类的实例赋值给instance
    private static Singleton instance = null;

    private Singleton(){
        System.out.println("构造块~");
    }

    public static Singleton getInstance(){
        //N个线程会同时进入,N个线程会同时判断instance==null
        //假设N=100,假设10个跑得快的线程同时判断出来instance==null
        //另外90个线程跑得慢
        
        //第一个判断的作用 - 让后面的线程不要再去抢锁 - 没有意义了
        if(instance==null) {//提高执行效率,介绍加锁和释放锁的次数
            //跑得快的10个线程在这里抢"锁"
            synchronized (Singleton.class) {//skip
                //谁抢到谁进来,第一次进入,判断为null
                
                //第二个判断的作用 - 防止跑得快的线程会再次赋值
                if (instance == null) {
                    //由第一次进入到线程执行
                    instance = new Singleton();
                }
            }
            //抢到锁的线程会立即释放锁资源
        }
        return instance;
    }
}
class SingletonTest{
    public static void main(String[] args) {
        for (int i = 0; i < 1000; i++) {
            Thread t = new Thread(()->{
                Singleton s = Singleton.getInstance();
            });
            t.start();
        }
    }
}
~~~

## 7. volatile

> volatile - 禁止指令重排.
>
> ```
> //创建对象的标准的流程 - "自认为的"
> 
>  private static volatile Singleton instance = null;
>  接下来instance的执行顺序就是如下:
> //①申请空间,②初始化,调用构造方法(是一个完整的对象),③将对象在堆空间的内存地址赋值给引用变量
> ```

---

> ~~~java
> package tech.aistar.design.singleton.v5;
> 
> /**
>  * 本来用来演示: 懒汉模式
>  *
>  * @author success
>  * @date 2023/7/27 14:11:59
>  */
> public class Singleton {
> 
>     //懒汉模式 - 加载Singleton的时候,并没有立即将类的实例赋值给instance
>     private static volatile Singleton instance = null;
> 
>     private Singleton(){
>         System.out.println("构造块~");
>     }
> 
>     public static Singleton getInstance(){
>         //创建对象的标准的流程 - "自认为的"
>         //①申请空间,②初始化,调用构造方法(是一个完整的对象),③将对象在堆空间的内存地址赋值给引用变量
> 
>         //TODO... 实际的顺序,jvm会进行指令重排,重排后的顺序①-③-②
> 
>         //N=100个线程
>         //假设10个线程可以同时判断为null
> 
>         //等第一个线程执行①-③之后,另外90个线程进来了,判断不为null,直接return instance
>         //但是这个90个线程拿到的是一个不完整对象的引用,然后可能就去使用这个不完整的对象 - 造成不可预期的结果.
>         if(instance==null) {
> 
>             //10个线程竞争锁资源
>             synchronized (Singleton.class) {//skip
> 
>                 //其中的一个线程进入...
>                 if (instance == null) {
> 
>                     //按照指令重排后的顺序,  第一个线程进入之后按照①-③ , instance已经不为null
>                     //此时instance指向的那个对象仍然是一个不完整的对象,因为还没有来得及执行完构造.
>                     instance = new Singleton();
>                 }
>             }
>             //抢到锁的线程会立即释放锁资源
>         }
>         return instance;
>     }
> }
> class SingletonTest{
>     public static void main(String[] args) {
>         for (int i = 0; i < 1000; i++) {
>             Thread t = new Thread(()->{
>                 Singleton s = Singleton.getInstance();
>             });
>             t.start();
>         }
>     }
> }
> ~~~



# 6. final关键字作用

final - 最终的,不可变的...

1. final修饰的局部变量,一旦赋值不能修改.

2. final修饰的属性,一旦赋值不能够改变,定义的时候,必须要赋值

3. final修饰的类,不能够被继承

4. final修饰的方法,不允许重写

5. final和static一起使用 - 赋值方式有两种

   ~~~java
   public static final int YEAR = 1;
       
       public static final int MONTH;
   
       //通过静态代码块进行赋值
       static{
           MONTH=10;
   }
   ~~~

~~~java
1
1 1
2 1
1 2 1 1
1 1 1 2 2 1
  
...
~~~


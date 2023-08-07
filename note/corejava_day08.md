# 1. 对象与对象之间的关系

关系具备方向性,分成单向关联和双向关联

双向关联: 俩个对象中彼此维护/关联彼此

单向关联:关系的维护仅仅交给一方.

能用单向关联的绝对不要使用双向.

## 1. 1:1

一个用户对应一个用户详情

双向关联

~~~java
//用户
public class User{
  
  private UserInfo userInfo;
  
  public User(UserInfo userInfo){
    this.userInfo = userInfo;
  }
}

//用户详情
public class UserInfo{
  
  private User user;
  
  public UserInfo(User user){
    this.user = user;
  }
}

//测试
UserInfo info = new UserInfo(null);
User u=new User(info)
//彼此绑定
info.setUser(u);
~~~

单向关联

~~~java
public class User{
  
  private UserInfo userInfo;
  
  public User(UserInfo userInfo){
    this.userInfo = userInfo;
  }
}
public class UserInfo{
 
}

或者也可以把关系交给UserInfo,在userInfo中维护user
~~~



## 2. 1:N

双向关联

~~~java
public class Customer{
  private Ord[] ords;
}

public class Ord{
  private Customer customer;
}
~~~

单向

~~~java
--推荐
public class Customer{
  private Ord[] ords;
}

public class Ord{
  
}
~~~

or

~~~java
public class Customer{
 
}

public class Ord{
  private Customer customer;
}
~~~



## 3.  N:N

双向的

~~~java
public class Student{
  
  private Course[] course;
}

public class Course{
  
  private Student[] students;
  
}
~~~



## 4. 自关联

~~~java
public class Emp{
  
  private Emp[] emp;
}
~~~

---



# 2. 业务类

> 实体类 - 专门描述对象,属性,构造,getter/setter,toString - 主要描述和存储数据.
>
> 业务类 - 存储业务方法的,主要负责操作数据

1. 业务方法也存储在实体类中
   * 优点:业务方法中可以直接使用到实体类的数据
   * 缺点:业务类和实体类耦合在一起了 - 遵守软件的设计原则 - **单一职责原则** - 不能让一个类负责太多的功能 - 各个类各司其职.
2. 专门写一个业务类 - 专门写业务方法.

---



## 1. 布置一个练习

> 用俩种方式实现,实体类Account(id,accNo,balance),实现一个取钱和存钱的方法.

---



# 3. 继承

> 1. 拼音-Inheritance
>
> 2. java中使用extends关键字表示一个类会继承另外一个类.比如B类 extends A类
>
>    B类就是A类的子类或者叫做派生类,A类就是B类的超类,基类,父类.
>
> 3. 为什么要使用继承?开发中会将多个对象的公共的成员全部放入到父类中,该父类的各个子类对象可以共享这个父类中所有的非私有的成员.
>
> 4. 继承的优势 - 就是为了代码的拓展.  以及减少代码的冗余.提高代码的复用性.
>
>    ~~~java
>    比如有个Root类 - 完成功能1-走路
>    后期如果需要完成新的功能2 - 跑
>      
>    第一种解决方案 - 直接修改Root类 - 违背了设计原则 - 软件开闭原则
>    软件开闭原则 - 对内禁止修改,对外允许拓展.
>      
>    第二种解决方案 - RootSub extends Root
>    ~~~
>
> 5. 继承的缺点 - 破坏封装性.一旦修改了父类,可能会对这个父类下的子类产生影响,增加了俩个类之间的耦合.
>
> 6. Java中继承支持单继承.  一个类只能允许有唯一一个直接的父类.  如果一个类没有使用extends来在指定明确的父类,那么这个类
>
>    默认直接继承java.lang.Object[所有类的基类.]
>
>    单继承的好处 - 保证类的层次性,避免出现网状结构.
>
> 7. 一个父类可以拥有多个子类.
>
> 8. 不能为了继承而继承 - 动物园管理系统   - 满足  a is b => a extends b

---

## 创建子类对象的过程

> 子类对象创建之前,会先创建父类对象,并且调用父类的构造.
>
> 本质上是因为子类构造中省略了关键的语句super()

---

1. 创建子类对象
2. 调用父类构造 - super() - 父类构造没有执行完毕之前,子类的属性值都是系统默认值
3. super一旦执行完毕,子类的属性才会进行赋值.
4. 调用子类自己的构造.

# 4. super关键字

> this和super的区别.

> 1. 在子类构造中可以使用super来调用父类中存在的构造.并且必须出现在首行.
>
>    如果没有提供,默认分配一个super();
>
> 2. 如果子类成员名称和父类成员名称发生冲突的时候,那么需要使用super.成员强制调用父类中的.

---

# 5. 四种访问修饰符

> public protected 默认的 private四种访问修饰符 - 决定成员的可以被访问的访问.

|                        | 所有类 | 子类(可以跨包) | 同包 | 本类 |
| ---------------------- | ------ | -------------- | ---- | ---- |
| public - 公共的,公开的 | √      | √              | √    | √    |
| protected - 受保护的   | ×      | √              | √    | √    |
| 默认的                 | ×      | ×              | √    | √    |
| private - 私有的       | ×      | ×              | ×    | √    |

# 6. 方法的重写

> **子类一旦重写了父类中的方法,那么子类就会采取就近原则,调用自己重写之后的方法.**

> @override
>
> 发生的前提
>
> 1. 一定是存在父子关系.
>
> 2. 重写的方法的名称/方法参数列表一定是一样的
>
> 3. 子类的访问修饰符访问的范围要大于等于父类的访问修饰符.
>
>    public>protected>默认的>private
>
> 4. 子类的返回类型要小于或者等于父类的访问修饰符
>
>    `小于 - 强调的子类的返回类型可以是父类的返回类型的子类.`
>
> 5. 子类的方法签名上抛出的异常列表小于或者等于父类的异常列表.

---

`如果子类重写的方法 - 修饰符,返回类型,方法名,方法参数列表高度保持一致 - 属于重写的特殊的一种 - 重构`

---

# 7. 多态

> Polymorphism - 相同的消息给予不同的对象会引发不同的动作.
>
> 或者理解为:相同的动作给予不同的对象,会产生不同的执行结果.

---

多态的应用:

1. 面向父类编程

   1. 对象的编译时类型写成父类,对象的运行时类型写成子类.

      * 编译时类型 对象名 = new 运行时类型();

      * 编译时类型决定了对象的访问能力.
      * 运行时类型决定了对象的行为能力.

   2. 方法的返回类型写成父类,方法的执行结果可以写成子类 => 简单工厂设计模式

   3. 方法的参数列表写成父类,调用方法传入的实参可以是子类.

2. 面向接口编程



# 8. instanceof作用

> 类型的检测,返回true,才能够进行强制类型转换(父类转换成子类) - 否则会抛出java.lang.ClassCastException类型转换失败异常.

---



# 9. 作业

> ~~~java
> Shape形状类 => area girth
>   
> 子类Circle => 定义半径,3.14 => 重写area,girth
>   
> 子类Rect => len,width => 重写area,girth
> public Rect(int len,int width){
>   
> }
>   
> 子类Square √
> public Square(int len){
>   super(len,len);
> }
> 
> //测试 定义形状数组 - 遍历数组 - 打印周长和面积
> ~~~
>
> ---

> ~~~java
> 某公司的雇员分为以下若干类：
> Employee：这是所有员工总的父类，
> 属性：员工的姓名,员工的生日。Date birthday
> 方法：getSalary(int month)
> 根据参数月份来确定工资，
> 如果该月员工过生日，则公司会额外奖励100元。
> 
> SalariedEmployee：
> Employee的子类，拿固定工资的员工。属性：月薪
>   
> super.getSalary(month) + base;
> 
> HourlyEmployee：
> Employee的子类，按小时拿工资的员工，
> 属性：每小时的工资、每月工作的小时数
> 每月工作超出160小时的部分按照1.5倍工资发放。
> 
> SalesEmployee：
> Employee的子类，销售人员，工资由月销售额和提成率决定。
> 属性：月销售额、提成率...
> 
> BasedPlusSalesEmployee：
> SalesEmployee的子类，有固定底薪的销售人员，
> 工资由底薪加上销售提成部分。属性：底薪。
> 
> 写一个程序，把若干各种类型的员工放在一个Employee数组里，
> 写一个函数，打印出某月每个员工的工资数额。
> 注意：要求把每个类都做成完全封装，不允许非私有化属性。
> ~~~




# 1. 二维数组

> 回忆定义一维数组
>
> 元素类型[] 变量 = new 元素类型[长度]
>
> `元素类型 - 1. 决定了数组中可以存储的数据类型;2.元素类型可以是八种基本数据类型以及对象类型`
>
> `数组本身就是一个对象类型 - int[]`
>
> ~~~java
> 比如int[][] arr = new int[rows][cols];
> 或者int arr[][] = new int[rows][cols];
> ~~~
>
> `二维数组中的每个元素都是一维数组`

## 2. 赋值方式

> 1. 可以通过下标一一赋值
>
>    ~~~java
>    arr[0][0] = 10;
>    ~~~

> 2. 定义数组的同时进行赋值
>
>    ~~~java
>    int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
>    
>    int[][] arr1 = {{1,2},{3,4},{5,6}};
>    ~~~
>
> 3. 先定义数组,然后一行一行进行赋值
>
>    ~~~java
>    int[][] arr = new int[2][3];
>    
>    arr[0] = new int[]{1,2,3};
>    arr[1] = new int[]{4,5,6};
>    
>    //但是不能这样写
>    //arr[0]={5,6,7};//编译是错误的
>    ~~~
>
> 4. 定义一个不规则的二维数组,定义二维数组的时候,列是可以省略不写的
>
>    `但是使用之前需要先初始化`
>
>    ~~~java
>    int[][] arr = new int[3][];
>    arr[0] = new int[]{1};
>    arr[1] = new int[]{1,1};
>    arr[2] = new int[]{1,2,1};
>          
>    或者
>    int[][] arr5 = {{100},{100,200},{100,300}};
>    ~~~

## 3. 遍历方式

> 0. 通过下标一一输出

> 1. 遍历方式一
>
>    ~~~java
>    int[][] arr = new int[][]{{1,2,3},{4,5,6},{7,8,9}};
>    
>    for(int i = 0;i<arr.length;i++){
>      System.out.println(Arrays.toString(arr[i]));
>    }
>    ~~~
>
> 2. 双层for循环遍历
>
>    ~~~java
>    for(int i = 0;i<arr.length;i++){
>      //int[] temp = arr[i];
>      for(int j = 0;j<arr[i].length;j++){
>        System.out.print(arr[i][j]+"\t");
>      }
>      System.out.println();
>    }
>    ~~~
>
> 3. 双层增强for循环
>
>    ~~~java
>    for(int[] e:arr){
>      for(int t:e){
>         System.out.print(t+"\t");
>      }
>      System.out.println();
>    }
>    ~~~

> 4. 数组工具类java.util.Arrays提供的static String deepToString(数组对象);

# 2. 数组的拷贝

> 数组中内存中一块连续的空间-并且`数组的大小(长度)一旦确定了 - 内存中是绝对不允许修改的`
>
> `业务中实现数组的 - 只要涉及到影响到数组的大小 - 增加/删除/去重 - 不存在这些操作的`

---

> 1. java.util.Arrays
>
>    static int[] copyOf(int[] original,int newLength);//适合在末尾添加数据
>
>    | `static int[]` | `copyOf(int[] original, int newLength)`复制指定的数组，用零截取或填充（如有必要），以便复制具有指定的长度。 |
>    | -------------- | ------------------------------------------------------------ |
>    |                | original - 原来的数组,newLength=>新数组长度                  |

> 2. java.lang.System
>
>    ```java
>    System.arraycopy(original, 0, copy, 0,Math.min(original.length, newLength));
>    1. origginal - 原数组
>    2. 0 - 从原数组的哪个下标开始拷贝
>    3. copy - 目标数组
>    4. 0 - 拷贝到目标数组的哪个位置(下标处)
>    5. 最后一个长度 - 拷贝的个数
>    ```

# N. 数组排序

## 1. 冒泡排序

**相邻的**俩个进行**俩俩**比较.每一轮比较完 - 确定一个最值

![](img/bubble.gif) 

~~~java
猴子🐒玉米 => 摘一个玉米,和手上的进行比较.保留最小的.
每次循环也是确定一个最值
  
/**
     * 冒泡排序 - 从小到大
     * @param arr
     */
  public static void bubbleSort(int[] arr){
  for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j < arr.length-1-i; j++) {
      if(arr[j]>arr[j+1]){
        arr[j] = arr[j]^arr[j+1];
        arr[j+1] = arr[j]^arr[j+1];
        arr[j] = arr[j]^arr[j+1];
      }
    }
  }
}
~~~

## 2. 选择排序

![](img/select.gif) 

~~~java
从数组的第1个位置,拿着这个值和后面的所有的数据进行比较,如果后面的值比这个位置的值要小.则交换.
每次都可以确定剩余值的最小值 - 从小到大排 
  
/**
     * 选择排序
     * @param arr
     */
 public static void selectSort(int[] arr){
  if(null==arr || arr.length==0)
    return;

  for (int i = 0; i < arr.length; i++) {
    for (int j = i+1; j < arr.length; j++) {
      if(arr[i]>arr[j]){
        arr[i] = arr[i]^arr[j];
        arr[j] = arr[i]^arr[j];
        arr[i] = arr[i]^arr[j];
      }
    }
  }
}
~~~



## 3. 直接插入排序

简介:***最简单的***

将数组中剩余的值(从数组中第2个位置开始)依次直接插入到前面,**保证前面的序列仍然是一个有序的序列**

类似于`斗地主 - 摸牌`

{3,1,2,5,4,6}

{***3***,1,2,5,4,6}

{***1,3***,2,5,4,6}

{***1,2,3***,5,4,6}

...

![](img/insert.gif) 

~~~java
//从小到大
public static void sortDirectInsert(int[] arr){
  if(null==arr || arr.length==0)
    return;
  //从第二个位置,下标为1

  //桌子牌 3,1,2,5,4,6
  for (int i = 1; i < arr.length; i++) {
    //摸了一张牌3
    //arr[2] = 2

    //记录手中牌的顺序=>  1 2 3
    for (int j = i; j >0 ; j--) {
      if(arr[j-1]>arr[j]){
        arr[j-1] = arr[j-1]^arr[j];
        arr[j] = arr[j-1]^arr[j];
        arr[j-1] = arr[j-1]^arr[j];
      }
    }
  }
}
~~~

## 4. 快速排序

![](img/fast.gif) 

算法思想:

**分治思想**:比大小,再分区

1. 从数组中取出一个数,作为**基准数**
2. 分区:将比这个数大或者等于的数全部放在它的右边,小于它的数全部放在它的左边
3. 再对左右分区间重复第二步骤,直到各分区只有一个数

实现思路:

`挖坑填数`

1. **将基准数挖出形成第一个坑**
2. **由后向前找比它小的数,找到后挖出此数填到前一个坑中**
3. **由前向后找比它大或等于的数,找到后也挖出此数填到前一个坑中**
4. **再重复执行2,3两步骤.例如对5391672408**

| 元素 | 5    | 3    | 9    | 1    | 6    | 7          | 2    | 4    | 0    | 8    |
| ---- | ---- | ---- | ---- | ---- | ---- | ---------- | ---- | ---- | ---- | ---- |
| 坑位 | 坑0  |      | 坑2  |      | 坑4  | 重合的位置 | 坑5  | 坑3  | 坑1  |      |
|      | 0    | 3    | 4    | 1    | 2    | 5基准数    | 7    | 6    | 9    | 8    |
| 坑位 |      |      |      |      |      |            |      |      |      |      |

第一轮以数组中的第一个元素5为基准数 - 经过一轮循环走完 - 以5位置为基准,左边的都是比5小的值,右边的都是大于或者等于5的数字 - **关键就是找到重合的位置!!!(分区 - 递归调用)**

~~~java
/**
     * 快速排序
     * @param arr
     * @param startIndex
     * @param endIndex
     */
public static void quickSort(int[] arr,int startIndex,int endIndex){
  if(startIndex<endIndex) {
    //1. 找到重合的位置
    //分区 - 挖坑填数
    int index = getIndex(arr, startIndex, endIndex);

    //2. 递归调用自己
    //index左边的
    quickSort(arr, startIndex, index - 1);

    //index右边的
    quickSort(arr, index + 1, endIndex);
  }
}

private static int getIndex(int[] arr, int startIndex, int endIndex) {
  int i = startIndex;
  int j = endIndex;
  //1. 确定基准数
  int x = arr[i];

  while(i<j){
    //由后向前找比它小的数,找到后挖出此数填到前一个坑中
    while(i<j && arr[j]>=x){
      j--;
    }
    //如果arr[j]<x
    if(i<j){
      arr[i] = arr[j];
      i++;
    }
    //**由前向后找比它大或等于的数,找到后也挖出此数填到前一个坑中**
    while(i<j && arr[i]<x){
      i++;
    }
    if(i<j){
      //arr[i]开始大于等于x
      arr[j] = arr[i];
      j--;
    }
  }
  //说明i开始j重合
  arr[i] = x;//把基准数放入到重合的位置
  return i;
}
~~~


package teach.aistar.day16.EnumDemo;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 15:08
 */
public enum Enumdemo {
    //1.定义枚举常量,多个枚举用逗号隔开
    //如果最后一个枚举常量后面没有代码,可以不加分号,如果后面有代码必须加分号
    //每个枚举类型在编译之后,都是这个枚举的实例
    F("女"),
    M("男");
    private String name;

    Enumdemo(){
        System.out.println("构造函数");
    }

    public String getName(){
        return name;
    }


    Enumdemo(String name){
        this.name=name;
    }
}
class Test{
    public static void main(String[] args) {
        Enumdemo[] e=Enumdemo.values();
        for (Enumdemo enumdemo : e) {
//            System.out.println(enumdemo.name());//枚举常量名称
//            System.out.println(enumdemo.name()+":"+enumdemo.getName());
//            System.out.println(enumdemo.ordinal());//枚举常量序号,从0开始
        }
        String str="F";
        Enumdemo e1=Enum.valueOf(Enumdemo.class,str);
        System.out.println(e1.getName());
    }
}
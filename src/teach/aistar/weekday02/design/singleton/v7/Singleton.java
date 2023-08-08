package teach.aistar.weekday02.design.singleton.v7;

import teach.aistar.day09.design.Single;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 17:26
 */
public enum Singleton {
    INSTANCE;
    Singleton(){
        System.out.println("无参构造");
    }
}
class SingletonTest{
    public static void main(String[] args) {
        Singleton s1 = Singleton.INSTANCE;
        Singleton s2 = Singleton.INSTANCE;
        System.out.println(s1==s2);
    }
}

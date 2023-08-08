package teach.aistar.weekday02.design.singleton.v6;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 17:18
 * 反射技术
 */
public class ReflectionDemo {
    public static void main(String[] args) {
//        Class<?> c1=PP.class;
//            Constructor<?> cc = null;
//            try {
//                cc = c1.getDeclaredConstructor();
//                cc.setAccessible(true);
//                PP s1 = (PP) cc.newInstance();
//                PP s2 = (PP) cc.newInstance();
//                System.out.println(s1 == s2);
//                Constructor<?> c2 = c1.getDeclaredConstructor(String.class, int.class);
//                c2.setAccessible(true);
//                PP s3 = (PP) c2.newInstance("admin",12);
//            } catch (NoSuchMethodException e) {
//                throw new RuntimeException(e);
//            } catch (InvocationTargetException e) {
//                throw new RuntimeException(e);
//            } catch (InstantiationException e) {
//                throw new RuntimeException(e);
//            } catch (IllegalAccessException e) {
//                throw new RuntimeException(e);
//            }
        //第二种反射
        Class c1= null;
        try {
            c1 = Class.forName("teach.aistar.weekday02.design.singleton.v6.PP");
            try {
                Method pp = c1.getMethod("setName", String.class);
                PP s4 = (PP) c1.newInstance();
//                Method ppp = c1.getMethod("getName", String.class);
                Constructor declaredConstructor = c1.getDeclaredConstructor();
                declaredConstructor.setAccessible(true);
                PP s1 = (PP) declaredConstructor.newInstance();
                pp.invoke(s1,"admin");
                System.out.println(s1.getName());
            } catch (InstantiationException e) {
                    throw new RuntimeException(e);
                } catch (IllegalAccessException e) {
                    throw new RuntimeException(e);
                } catch (InvocationTargetException e) {
                    throw new RuntimeException(e);
                }
            } catch (NoSuchMethodException e) {
                throw new RuntimeException(e);
            } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        }
    }
}

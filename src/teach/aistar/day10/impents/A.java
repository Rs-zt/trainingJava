package teach.aistar.day10.impents;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/2 22:19
 */
public interface A {
      int a=10;
     default void aa(){
         System.out.println("aaaa");
     }
     static  void bb(){
         System.out.println("bbbb");
     }
     private void cc(){
         System.out.println("cccc");
     }
}

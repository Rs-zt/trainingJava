package teach.aistar.day12;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/1 10:18
 */
public class StringBuildertest {
    public static void main(String[] args) {
        StringBuildertest s3 = new StringBuildertest();
        s3.test1();
        s3.test2();

    }
    public void test1(){
        long t=System.currentTimeMillis();
        String s1="";
        for (int i = 0; i < 100000; i++) {
            s1+=i;
        }
        System.out.println((System.currentTimeMillis()-t)+"ms");
    }
    public void test2(){
        long t=System.currentTimeMillis();
        StringBuilder s2 = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            s2.append(i);
        }
        System.out.println((System.currentTimeMillis()-t)+"ms");
    }
}

package teach.aistar.day17;

import java.io.*;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/8 14:10
 */
public class InputStreamDemo {
    public static void main(String[] args) throws IOException {
//        copyFile("src//teach//aistar//day17//xx.jpg","src//teach//aistar//day17//xx_副本.jpg");
        copyFile1("src//teach//aistar//day17//xx.jpg","src//teach//aistar//day17//xx_副本.jpg");
    }

    private static void copyFile1(String src, String target) {
        try(FileInputStream in=new FileInputStream(src);
            FileOutputStream out=new FileOutputStream(target)) {
            int len=-1;
            while (true){
                len=in.read();
                if (len==-1){
                    break;
                }
                //输出
                out.write(len);
            }
            System.out.println("拷贝成功");

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void copyFile(String src, String target) throws IOException {
        //确定流和声明流
        InputStream in=null;
        OutputStream out=null;
        //初始化流
         in = new FileInputStream(src);
         out = new FileOutputStream(target);
         //定义一个变量-用来保存字节
        int len =-1;
        //循环写入
        while (true){
            //从输入流中读取数据
            len=in.read();
            if (len == -1) {
                break;
            }
            //将指定字节进行输出
            out.write(len);
        }
        System.out.println("拷贝成功");
        if (null!=in){
            in.close();
        }
        if (null != out) {
            out.close();
        }
    }
}

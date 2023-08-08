package teach.aistar.day17;


import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/8 9:30
 */
public class FileDemo {
    public static void main(String[] args) {
        String uuid = UUID.randomUUID().toString();
        String uu = uuid + ".txt";
        createFile("E:\\CX_peixun\\demo3\\src\\teach\\aistar\\day17\\" + uu);
//        createFolder("src\\teach\\aistar\\day17\\");
    }

    private static void createFolder(String folder) {
    }

    private static void createFile(String s) {
        //创建文件
        File file = new File(s);
        //判断该文件是否存在
        if (file.exists()) {
            System.out.println(file + "已存在");
            return;
        }
        try {
            if (file.createNewFile()) {
                File absoluteFile = file.getAbsoluteFile();
                System.out.println("绝对路径:" + absoluteFile);
                System.out.println("文件名称:" + file.getName());
                System.out.println("父目录:" + file.getParent());
                System.out.println("Path:" + file.getPath());
                System.out.println("获取文件空间:" + file.getTotalSpace());
            } else {
                System.out.println("创建失败");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}

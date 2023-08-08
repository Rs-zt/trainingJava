package teach.aistar.day17;


import java.io.File;
import java.io.FilenameFilter;
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
//        createFile("E:\\CX_peixun\\demo3\\src\\teach\\aistar\\day17\\" + uu);
//        createFolder("src\\teach\\aistar\\day17\\aa\\b\\c");
//        deleteFileFolder("src\\teach\\aistar\\day17\\aa\\b\\c");
//        listFile("E:\\CX_peixun\\demo3\\src");
//        listAllFIle("E:\\CX_peixun\\demo3");
        listAllFileWithSuffix("E:\\CX_peixun\\demo3\\src\\teach\\aistar\\day17\\","(\\w{8}(-\\w{4}){3}-\\w{12}.*)");

    }

    private static void listAllFileWithSuffix(String folderPath, String suffix) {
        //1. 构建file实例
        File file = new File(folderPath);

        //2. 递归出口
//        if(file.isFile()){
//            System.out.println(file.getName());
//            return;
//        }

        //返回给定的目录下的第一层的所有的file
        File[] files = file.listFiles(new FilenameFilter() {
            @Override
            public boolean accept(File dir, String name) {
                //System.out.println("dir:"+dir+",name:"+name);
                File f = new File(dir,name);
                //进行筛选
                if(f.isDirectory()){//返回true
                    return true;
                }
                //找出后缀
//                if(f.getName().endsWith(suffix)){
//                    return true;
//                }

                //配合正则表达式
                if(f.getName().matches(suffix)){
                    return true;
                }

//                if(f.getName().contains(suffix)){
//                    return true;
//                }
                //如果返回true,那么当前的file才会放入到files数组中
                return false;
            }
        });

        for (File f : files) {
            //如果是目录 - 绝对路径
            if (f.isDirectory()) {
                //System.out.println(f.getAbsolutePath());
                //递归调用自己
                listAllFileWithSuffix(f.getAbsolutePath(),suffix);
            } else if(f.isFile()){
                System.out.println(f.getName());
            }
        }
    }

    private static void listFile(String s) {
        //创建file实例
        File file = new File(s);
        //判断一下是否存在
        if (!file.exists()){
            System.out.println("");
        }
    }

    private static void listAllFIle(String s) {
        //1. 构建file实例
        File file = new File(s);
        //2. 判断一下是否存在
        if(!file.exists()){
            System.out.println("sorry!");
            return;
        }
        //3. 保证file是一个文件夹
        if(file.isDirectory()){
            //返回给定的目录下的第一层的所有的file
            File[] files = file.listFiles();
            for (File f : files) {
                //如果是目录 - 绝对路径
                if(f.isDirectory()){
                    System.out.println(f.getAbsolutePath());
                    listAllFIle(f.getAbsolutePath());
                }else if (f.isFile()){
                    System.out.println(f.getName());
                }
                //如果是文件 - 文件名
            }
        }else{
            System.out.println(file+"不是一个目录!");
        }

    }

    private static void deleteFileFolder(String s) {
        File file = new File(s);
        if (!file.exists()) {
            System.out.println(file + "不存在");
            return;
        }
        //如果是文件实例,可以直接删除
        if (file.delete()){
            System.out.println(file + "删除成功");
        }else {
            System.out.println(file + "删除失败");
        }

    }

    private static void createFolder(String folder) {
        File file = new File(folder);
        if (file.exists()) {
            System.out.println("sorry,"+file+"已经存在");
            return;
        }
        //创建多个目录
        if (file.mkdirs()){
            System.out.println(file + "创建成功");
        }else {
            System.out.println("创建失败");
        }
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

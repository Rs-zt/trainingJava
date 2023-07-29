package teach.aistar.day10.HomeWork;

import teach.aistar.day10.HomeWork.BookDaoImpl;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 17:45
 */
public class page {
    public void execute() throws ParseException {
        BookDaoImpl bookDao = new BookDaoImpl();
        int count = 0;
        boolean flag = true;
        while (flag) {
        System.out.println("======图书管理系统======\n" +
                "1. 保存图书\n" +
                "2. 查询所有图书\n" +
                "3. 根据编号删除图书\n" +
                "4. 根据价格降序排\n" +
                "5. 统计图书类别数量\n"+
                "0. 退出图书管理系统");
            System.out.println("请输入:>");
            Scanner sc = new Scanner(System.in);
            int s = sc.nextInt();
            switch (s) {
                case 1:
                    bookDao.save(bookDao.getDbBook()[count++]);
                    break;
                case 2:
                    bookDao.findAll();;
                    break;
                case 3:
                    bookDao.delByIsbn();
                    break;
                case 4:
                    System.out.println(Arrays.toString(bookDao.sortByPriceDesc()));
                    break;
                case 5:
                    bookDao.NumberOfType();
                    break;
                case 0:
                    flag=false;
                    break;
                default:
                    System.out.println("输入错误,请重新输入");
            }
        }
    }
}

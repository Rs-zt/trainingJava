package teach.aistar.day10.HomeWork;

import teach.aistar.day10.HomeWork.BookDaoImpl;
import teach.aistar.day10.HomeWork.PageInfo.BookTeplate;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 17:45
 */
public class page extends BookTeplate {
    public void execute() throws ParseException {
        BookDaoImpl bookDao = new BookDaoImpl();
        boolean flag = true;
        while (flag) {
            int count = 0;
            System.out.println("返回菜单 6\t直接查询 2");
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
                    bookDao.sortByPriceDesc();
                    break;
                case 5:
                    bookDao.NumberOfType();
                    break;
                case 6:
                    new page().open();
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

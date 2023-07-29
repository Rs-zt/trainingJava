package teach.aistar.day10.HomeWork.PageInfo;

import java.text.ParseException;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 17:13
 */
public abstract class BookTeplate {
    public void open(){
        System.out.println("======图书管理系统======\n" +
                "1. 保存图书\n" +
                "2. 查询所有图书\n" +
                "3. 根据编号删除图书\n" +
                "4. 根据价格降序排\n" +
                "5. 统计图书类别数量");
    }
    public abstract void execute() throws ParseException;
    public final void task() throws ParseException {
        open();
        execute();
    }

}

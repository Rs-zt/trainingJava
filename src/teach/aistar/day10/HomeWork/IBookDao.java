package teach.aistar.day10.HomeWork;

import java.text.ParseException;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 16:41
 */
public interface IBookDao {

    void save(Book b) throws ParseException;//增加一个图书

    Book[] findAll();//查询所有的图书

    void delByIsbn();//isbn唯一的,根据编号删除

    Book[] sortByPriceDesc();//根据价格降序排

    //统计每个类型的个数
    //Java 3,Python 5,Mysql 1
    void NumberOfType();

}

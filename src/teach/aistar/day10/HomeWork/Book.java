package teach.aistar.day10.HomeWork;

import teach.aistar.weekday02.day06.DateUtil;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 16:38
 * id,isbn(图书编号),bookName(名称),price(价格),type(图书类别-String - "Java","Python","Mysql"),createDate(出版日期)
 */
public class Book {
    private int id;
    private String isbn;
    private String bookName;
    private double price;
    private String type;
    private Date createDate;


    public Book() {
    }

    public Book(int id, String isbn, String bookName, double price, String type, Date createDate) {
        this.id = id;
        this.isbn = isbn;
        this.bookName = bookName;
        this.price = price;
        this.type = type;
        this.createDate = createDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("");
        sb.append("图书ID: ").append(id);
        sb.append(", 图书编号: '").append(isbn).append('\'');
        sb.append(", 图书名字: '").append(bookName).append('\'');
        sb.append(", 价格: ").append(price);
        sb.append(", 类型: '").append(type).append('\'');
        sb.append(", 出版时间: ").append(DateUtil.SimpFormat(createDate,"yyyy年MM月dd日"));
        return sb.toString();
    }
}

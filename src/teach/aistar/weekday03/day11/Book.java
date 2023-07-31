package teach.aistar.weekday03.day11;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 18:47
 */
public class Book implements Cloneable{
    private int id;
    private String isbn;
    private String name;
    private double price;
    private String type;
    private BookInfo bookInfo;

    public Book() {
    }
    //测试

    public Book(int id, String isbn, String name, double price) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.price = price;
    }

    public Book(int id, String isbn, String name, double price, String type, BookInfo bookInfo) {
        this.id = id;
        this.isbn = isbn;
        this.name = name;
        this.price = price;
        this.type = type;
        this.bookInfo = bookInfo;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public BookInfo getBookInfo() {
        return bookInfo;
    }

    public void setBookInfo(BookInfo bookInfo) {
        this.bookInfo = bookInfo;
    }

    @Override
    public boolean equals(Object obj) {
        //非空性判断
        if (obj==null)return false;
        //自反性判断
        if (this==obj)return true;
        //类型一致性
        //另一种写法
//        obj instanceof Book;?
        if (getClass()!=obj.getClass())return false;
        Book b=(Book)obj;
//        return this.id==b.getId();
//        return this.id==b.getId()&&this.isbn.equals((b.getIsbn()));
        return this.id==b.getId()&&(null!=this.bookInfo&&this.bookInfo.equals(b.bookInfo));
    }

    //浅拷贝
//    @Override
//    public Object clone() throws CloneNotSupportedException {
//        return super.clone();
//    }
    //深拷贝,将原有对象的无论是基本数据类型还是引用数据类型全部拷贝一份给副本,修改原型对象都会对副本造成影响


    @Override
    protected Object clone() throws CloneNotSupportedException {

        Book b = new Book();
        b.setId(id);
        b.setIsbn(isbn);
        b.setName(name);
        b.setPrice(price);
        b.setType(type);
        if (bookInfo!=null){
            BookInfo bookInfo1 = new BookInfo();
            bookInfo1.setId(bookInfo.getId());
            bookInfo1.setInfo(bookInfo.getInfo());
            b.setBookInfo(bookInfo1);
        }
        return b;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Book{");
        sb.append("id=").append(id);
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", price=").append(price);
        sb.append(", type='").append(type).append('\'');
        sb.append(", bookInfo=").append(bookInfo);
        sb.append('}');
        return sb.toString();
    }
}

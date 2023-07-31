package teach.aistar.day11;

import java.util.Date;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 15:13
 */
public class Book {

        private int id;

        private String isbn;

        private String bookName;

        private double price;

        private String type;

        private Date createDate;

        //关联一个对象
        private BookInfo bookInfo;

        public Book() {

        }

        //测试...
        public Book(int id, String isbn, String bookName, double price) {
            this.id = id;
            this.isbn = isbn;
            this.bookName = bookName;
            this.price = price;
        }

        public Book(int id, String isbn, String bookName, double price, String type, Date createDate) {
            System.out.println("book全参构造~");
            this.id = id;
            this.isbn = isbn;
            this.bookName = bookName;
            this.price = price;
            this.type = type;
            this.createDate = createDate;
        }

        public void setBookInfo(BookInfo bookInfo) {
            this.bookInfo = bookInfo;
        }

        public BookInfo getBookInfo() {
            return bookInfo;
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

        //@Override
        public boolean equals2(Object obj) {
            //1. 非空性判断
            if(obj == null) return false;

            //2. 自反性判断
            if(this == obj) return true;

            //3. 类型一致性
            //3-1. obj instanceof Book
            //3-2. 判断对象的class实例
            // if(!(obj instanceof Book)) return false;

            if(getClass() != obj.getClass()) return false;

            //根据实际业务的比较的需求来控制它的返回结果
            //比如只要id一样,就认为是同一个对象
            Book b = (Book) obj;
            //return this.id == b.getId();

            //id和isbn一致的时候,才认为是同一个对象
            //return this.id == b.getId() && this.isbn.equals(b.getIsbn());

            //TODO... book的id以及book关联的bookInfo的id一致的时候,才认为是同一个对象
            return this.id == b.getId() && (null!=this.bookInfo && this.bookInfo.equals(b.getBookInfo()));

            //return false;
        }

        @Override
        public Object clone() throws CloneNotSupportedException {
            return super.clone();
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Book{");
            sb.append("id=").append(id);
            sb.append(", isbn='").append(isbn).append('\'');
            sb.append(", bookName='").append(bookName).append('\'');
            sb.append(", price=").append(price);
            sb.append(", type='").append(type).append('\'');
            sb.append(", createDate=").append(createDate);
            sb.append('}');
            return sb.toString();
        }
    }

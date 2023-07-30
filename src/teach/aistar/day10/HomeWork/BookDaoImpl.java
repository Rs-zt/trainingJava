package teach.aistar.day10.HomeWork;

import teach.aistar.weekday02.day06.DateUtil;
import teach.aistar.weekday02.day06.SimpleDateFormatDemo;

import java.text.ParseException;
import java.util.Arrays;
import java.util.Date;
import java.util.Scanner;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 17:11
 */
public class BookDaoImpl implements IBookDao{


        // 模拟db
        private  Book[] dbBook = new Book[10];
        //表示有效长度
        private int size;


        public Book[] getDbBook() {
                return dbBook;
        }

        public void setDbBook(Book[] dbBook) {
                this.dbBook = dbBook;
        }

        public void save(Book b) throws ParseException {

                while (true){
                        Scanner scanner = new Scanner(System.in);
                        System.out.println("请输入图书ID");
                        int id = scanner.nextInt();
                        System.out.println("请输入图书编号");
                        String isbn = scanner.next();
                        System.out.println("请输入图书名称");
                        String bookname = scanner.next();
                        System.out.println("请输入图书价格");
                        double price = scanner.nextDouble();
                        System.out.println("请输入图书类型");
                        String type=scanner.next();
                        System.out.println("请输入图书出版时间");
                        String str=scanner.next();
                        Date date=DateUtil.SimpPare(str,"yyyy-MM-dd");
                        scanner.nextLine(); // 读取换行符
                        Book book = new Book(id,isbn,bookname,price,type,date);
                        if (size == dbBook.length){
                                dbBook=Arrays.copyOf(dbBook,size+1);
                        }
                        dbBook[size++]=book;
                        break;
                }

        }


        @Override
        public Book[] findAll() {
                if (size==0) {
                        System.out.println("当前没有任何书籍。");
                        return null;
                } else {
                        System.out.println("所有书籍信息如下:");
                        dbBook=Arrays.copyOf(dbBook,size);
                        System.out.println(Arrays.toString(dbBook));
                }
                return dbBook;
        }

        @Override
        public void delByIsbn() {
                Scanner scanner = new Scanner(System.in);
                System.out.print("请输入要删除的图书编号: ");
                String  isbn = scanner.next();
                int index=0;
                //获取输入的编号和数组中图书编号相同时的下标
                for (int i = 0; i < size; i++) {
                        if (isbn.equals(dbBook[i].getIsbn())){
                                index=i;
                                break;
                        }else {
                                index=-1;
                        }
                }
                if (index!=-1){
                        System.arraycopy(dbBook,index+1,dbBook,index,size-index-1);
                        size--;//删一个减一个
                        System.out.println("删除图书成功");
                }else {
                        System.out.println("没有此编号图书");
                }
        }

        @Override
        public Book[] sortByPriceDesc() {
                Book temp;
                if(null==dbBook || dbBook.length==0)return dbBook;

                for (int i = 0; i < size; i++) {
                        for (int j = i+1; j < size; j++) {
                                if(dbBook[i].getPrice()<dbBook[j].getPrice()){
                                        temp=dbBook[i];
                                        dbBook[i]=dbBook[j];
                                        dbBook[j]=temp;
                                }
                        }
                }
                System.out.println(Arrays.toString(dbBook));
                return dbBook;
        }


        //统计每个类型的个数
        //Java 3,Python 5,Mysql
        @Override
        public void NumberOfType() {
                if (size == 0) {
                        System.out.println("暂无图书信息！");
                        return;
                }
                int count = 0;
                String type = dbBook[0].getType();
                for (int i = 0; i < size; i++) {
                        if (!type.equals(dbBook[i].getType())) {
                                System.out.println(type + ": " + count);
                                type = dbBook[i].getType();
                                count = 0;
                        }
                        count++;
                }
                System.out.println(type + ": " + count);
        }


        @Override
        public String toString() {
                final StringBuilder sb = new StringBuilder("BookDaoImpl{");
                sb.append("dbBook=").append(Arrays.toString(dbBook));
                sb.append(", size=").append(size);
                sb.append('}');
                return sb.toString();
        }
        }

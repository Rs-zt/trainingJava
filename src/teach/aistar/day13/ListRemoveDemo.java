package teach.aistar.day13;

import teach.aistar.day11.BookInfo;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/2 14:36
 */
public class ListRemoveDemo {
    public static void main(String[] args) {
        Book b1 = new Book(1,"1001","java",100.0d);
        Book b2 = new Book(2,"1002","java",150.0d);
        Book b3 = new Book(3,"1003","java",400.0d);
        Book b4 = new Book(3,"1004","java",300.0d);
        ArrayList<Book> list = new ArrayList<>();
        list.add(b1);
        list.add(b2);
        list.add(b3);
        list.add(b4);
        //根据下标删除,b3和b4会认为同一个对象
//        System.out.println(b3.equals(b4));
//        list.remove(b4);
        delPrice4(list,150.0d);
//        System.out.println(list);
    }

    private static void delPrice2(ArrayList<Book> list, double price) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()<=price){
                //直接删除对象
                list.remove(list.get(i));
                i--;
            }
        }
    }

    private static void delPrice1(ArrayList<Book> list, double price) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getPrice()<=price){
                list.remove(i);
            }
        }
    }
    //倒着来遍历,防止删完下标向左移
    private static void delPrice3(ArrayList<Book> list, double price) {
        for (int i = list.size()-1; i > 0; i--) {
            if (list.get(i).getPrice()<=price){
                list.remove(i);
            }
        }
    }
    //边读边改,会抛出异常
    private static void delPrice4(ArrayList<Book> list, double price) {
        Iterator<Book> iter= list.iterator();
        while (iter.hasNext()){
            Book next = iter.next();
            System.out.println(next);
            if (next.getPrice()<=price){
                list.remove(next);
            }
        }
    }

    private static void delPrice5(ArrayList<Book> list, double price) {
        for (Book b : list) {
            if (b.getPrice()<=price){
                list.remove(b);
            }
        }
    }
    //增强for循环在外部删除
    private static void delPrice6(ArrayList<Book> list, double price) {
        ArrayList<Book> delBooks = new ArrayList<>();
        for (Book b : list) {
            if (b.getPrice()<=price){
                delBooks.add(b);
            }
        }
        list.removeAll(delBooks);
    }
}

package teach.aistar.day11;

import java.util.Objects;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 15:13
 */
public class BookInfo {
        private int id;

        private String info;

        public BookInfo() {
        }

        public BookInfo(int id, String info) {
            System.out.println("bookInfo构造...");
            this.id = id;
            this.info = info;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getInfo() {
            return info;
        }

        public void setInfo(String info) {
            this.info = info;
        }

        //自己实现的
//    @Override
//    public boolean equals(Object obj) {
//        if(null == obj) return false;
//
//        if(this == obj) return true;
//
//        if(getClass()!=obj.getClass()) return false;
//
//        BookInfo info = (BookInfo) obj;
//
//        return this.id == info.getId();
//    }


        @Override
        public boolean equals(Object o) {
            System.out.println("equals...");
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            BookInfo bookInfo = (BookInfo) o;
            return id == bookInfo.id;
        }

        @Override
        public int hashCode() {
            int hash = Objects.hash(id);
            System.out.println("hash:"+hash);
            return hash;
        }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("BookInfo{");
            sb.append("id=").append(id);
            sb.append(", info='").append(info).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }


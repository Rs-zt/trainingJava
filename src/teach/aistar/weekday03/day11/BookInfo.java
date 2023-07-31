package teach.aistar.weekday03.day11;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/31 18:49
 */
public class BookInfo {
    private int id;
    private String info;

    public BookInfo() {
    }

    public BookInfo(int id, String info) {
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

    @Override
    public boolean equals(Object obj) {

        //非空性判断
        if (null==obj)return false;
        //自反性判断
        if (this==obj)return true;
        //类型一致性
        if (getClass()!=obj.getClass())return false;
        //根据id来判断对象是否相同
        BookInfo bookInfo=(BookInfo) obj;
        return this.id== bookInfo.getId();
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

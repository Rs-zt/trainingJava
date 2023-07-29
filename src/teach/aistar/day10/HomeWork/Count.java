package teach.aistar.day10.HomeWork;

import java.util.Arrays;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 17:08
 */
public class Count {
    private String type;
    private int num;
    private Count[] counts;

    public Count() {
    }
public Count(String type,int num){
        this.type=type;
        this.num=num;
}
    public Count(String type, int num, Count[] counts) {
        this.type = type;
        this.num = num;
        this.counts = counts;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Count[] getCounts() {
        return counts;
    }

    public void setCounts(Count[] counts) {
        this.counts = counts;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Count{");
        sb.append("type='").append(type).append('\'');
        sb.append(", num=").append(num);
        sb.append(", counts=").append(Arrays.toString(counts));
        sb.append('}');
        return sb.toString();
    }
}

package teach.aistar.day07.homework.test01;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/25 16:53
 * 二.写一个描述 显示器 的类
 * 含如下属性:
 * 	显示器类型 (如CRT ,液晶的,LED的)
 * 	显示器尺寸 (如 17寸\23\19\25)
 * 	显示器品牌 (如:三星\ViewSonic\SONY 等)
 *
 * 含如下方法:
 * 	构造方法
 * 	所有属性的 getter/setter方法
 *
 * 注：对于显示器尺寸，必需是 17\23\19\25	，其它尺寸都不合格，
 * 对于输入不合格的尺寸，统一规定是 17。
 */
public class Screen {
    private String type;
    private int size;
    private String S_brand;

    public Screen() {
    }

    public Screen(String type, int size, String s_brand) {
        this.type = type;
        this.size = size;
        S_brand = s_brand;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        //注：对于显示器尺寸，必需是 17\23\19\25	，其它尺寸都不合格，
        // * 对于输入不合格的尺寸，统一规定是 17。
        if (size==17||size==23||size==19||size==25){
            this.size = size;
        }else {
            this.size=17;
        }

    }

    public String getS_brand() {
        return S_brand;
    }

    public void setS_brand(String s_brand) {
        S_brand = s_brand;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Screen{");
        sb.append("type='").append(type).append('\'');
        sb.append(", size='").append(size).append('\'');
        sb.append(", S_brand='").append(S_brand).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

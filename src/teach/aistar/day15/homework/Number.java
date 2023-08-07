package teach.aistar.day15.homework;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 23:34
 */
public enum Number {
    ;
    public final  int Numvalue;
    private final  String NumChinese;

    Number(int numvalue, String numChinese) {
        Numvalue = numvalue;
        NumChinese = numChinese;
    }

    @Override
    public String toString() {
        return this.NumChinese;
    }
}

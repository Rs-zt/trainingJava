package teach.aistar.weekday02.design.singleton.v6;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/7 17:16
 */
public class PP {
    private String name;
    private PP(){
        System.out.println("空参构造");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private PP(String name, int x){
        System.out.println("带参数构造"+name+":"+x);
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PP{");
        sb.append("name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

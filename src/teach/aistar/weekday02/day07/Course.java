package teach.aistar.weekday02.day07;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 18:39
 */
public class Course {
    //属性私有化,属性不需要手动赋值,-由系统赋值
    private int id;
    private String name;

    public Course() {
    }

    public Course(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if ("xxxx".equals(name)){
            this.name="***";
            return;
        }
        this.name = name;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Course{");
        sb.append("id=").append(id);
        sb.append(", name='").append(name).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

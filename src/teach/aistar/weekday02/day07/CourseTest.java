package teach.aistar.weekday02.day07;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 18:43
 */
public class CourseTest {
    public static void main(String[] args) {
        Course course = new Course();
        System.out.println(course);//打印内存地址
        course.setId(1);
        course.setName("xxxx");
        System.out.println(course);
    }
}

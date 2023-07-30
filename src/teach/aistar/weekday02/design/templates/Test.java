package teach.aistar.weekday02.design.templates;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 20:18
 */
public class Test {
    public static void main(String[] args) {
        TeacherDaoImpl teacherDao = new TeacherDaoImpl();
        teacherDao.task();
        UserDaoImpl userDao = new UserDaoImpl();
        userDao.task();
    }
}

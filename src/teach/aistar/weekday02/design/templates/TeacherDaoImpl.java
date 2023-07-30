package teach.aistar.weekday02.design.templates;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 20:16
 */
public class TeacherDaoImpl extends JdbcTemplate{
    @Override
    public void execute() {
        System.out.println("select * from teacher;");
    }
}

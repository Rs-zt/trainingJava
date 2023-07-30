package teach.aistar.weekday02.design.templates;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 20:18
 */
public class UserDaoImpl extends JdbcTemplate{
    @Override
    public void execute() {
        System.out.println("select * from user;");
    }
}

package teach.aistar.day15.devs;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 18:49
 */
public class UserDaoImpl extends BaseDaoImpl<User> implements IUserDao{
    @Override
    public void save(User user, int a) {
        System.out.println("user"+a);
    }


    @Override
    public void userDao(User user) {
        System.out.println("自己写的");
    }
}

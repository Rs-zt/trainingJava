package teach.aistar.day15.devs;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 18:51
 */
public class UserDaoTest {
    public static void main(String[] args) {
        IUserDao userDao = new UserDaoImpl();
        User user = new User();
        userDao.save(user);
        userDao.userDao(user);
        userDao.save(user,100);
    }
}

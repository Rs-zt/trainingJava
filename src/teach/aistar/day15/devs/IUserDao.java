package teach.aistar.day15.devs;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 18:46
 */
public interface IUserDao extends IBaseDao<User>{
    void save(User user,int a);

    //自己特有的
    void userDao(User user);
}

package teach.aistar.day10.impents;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 13:16
 */
public class UserDaoTest {
    public static void main(String[] args) {
        System.out.println(IUserDao.day1);
        //接口不能被实例化
//        IUserDao userDao=new IUserDao();
        //调用静态方法
        IUserDao.testStatic();
        //对象的编译时类型写成接口,对象的运行时类型写成实现类
        IUserDao userDao = new UserDaoImpl();
        userDao.test();//接口中的普通方法
        userDao.changge();
        userDao.find();
        System.out.println("========");
        //对象的编译时类型决定了它的访问能力-只能访问到编译时类型的定义的成员
        UserDaoImpl2 userDaoImpl2 = new UserDaoSubImpl2();
        userDaoImpl2.find();
        //instanceof-类型检测--运行时类型检测
        System.out.println(userDaoImpl2 instanceof IUserDao);//true
        System.out.println(userDaoImpl2 instanceof UserDaoImpl2);//true
        System.out.println(userDaoImpl2 instanceof IBaseDao);//true
    }
}

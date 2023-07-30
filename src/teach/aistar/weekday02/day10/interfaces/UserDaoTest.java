package teach.aistar.weekday02.day10.interfaces;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 13:00
 */
public class UserDaoTest {
    public static void main(String[] args) {
        System.out.println(IUserDao.day);
        //接口不能被实例化
//        IUserDao iUserDao=new IUserDao();
        //调用静态方法
        IUserDao.testStatic();
        //对象的编译时类型写成接口,对象的运行时类型写成实现类
        IUserDao userDao = new UserDaoImpl();
        userDao.test();//接口中的方法
        userDao.change();
        System.out.println("=======");
        //对象的编译时类型决定了它的访问能力 - 只能访问到编译时类型定义的成员.
        //IUserDao dd = new UserDaoSubImpl2();
        IUserDao dd = new UserDaoSubImpl2();
        dd.find();
        //instanceof-类型检测-运行时类型检测
        System.out.println(dd instanceof IUserDao);
        System.out.println(dd instanceof UserDaoImpl2);
        System.out.println(dd instanceof IBaseDao);
    }

}

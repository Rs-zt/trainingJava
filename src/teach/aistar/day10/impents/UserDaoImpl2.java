package teach.aistar.day10.impents;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/28 11:43
 * 类可以实现多个接口,多个接口用逗号隔开,如果这个实现类是抽象的
 * 那么必须要实现,实现的接口中所有的方法
 * "除非这个实现类本身就是一个抽象的实现类
 */
public abstract class UserDaoImpl2 implements IUserDao,IBaseDao{

    @Override
    public void save() {
        System.out.println("save2....");

    }


    @Override
    public void find() {
        System.out.println("find...");
    }
}
class UserDaoSubImpl2 extends UserDaoImpl2{

    @Override
    public void changge() {

    }
}

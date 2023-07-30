package teach.aistar.weekday02.day10.interfaces;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/30 12:56
 */
public abstract class UserDaoImpl2 implements IUserDao,IBaseDao{
    /*
    * 类可以实现多个接口,多个接口用逗号隔开,如果这个实现类是非抽象的
    * 那么必要实现接口中所有的抽象方法
    *
    * 除非这个实现类本身就是一个抽象类
    *
    * */


    @Override
    public void changge() {
        System.out.println("change..");
    }

    @Override
    public void change() {

    }

    @Override
    public void cheng() {

    }
}
class UserDaoSubImpl2 extends UserDaoImpl2{

    @Override
    public void change() {
        System.out.println("change2...");
    }

    @Override
    public void find() {

    }

    @Override
    public void save() {

    }
}

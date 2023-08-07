package teach.aistar.day15.devs;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/8/4 18:43
 */
public class BaseDaoImpl<T> implements IBaseDao<T>{

    @Override
    public void save(T t) {
        //1. 获取连接
        //        Session session = sessionFactory.openSession();
        ////2. 开启事务
        //        Transaction tx = session.beginTransaction;
        ////3. 调用session的api方法
        //        session.save(user对象);
        ////4. 提交事务
        //        tx.commit();
        ////5. 关闭连接
        //        session.close();

        System.out.println("1.获取连接");
        System.out.println("2.开启事务");

        System.out.println("保存:"+t);

        System.out.println("4. 提交事务");
        System.out.println("5. 关闭事务");
    }
}

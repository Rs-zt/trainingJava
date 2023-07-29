package teach.aistar.weekday02.day08;

import teach.aistar.day08.homework.test02.Employee;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/27 20:02
 */
public class EmpTest {
    public static void main(String[] args) {
        Emp boss = new Emp(1, "boss", 2500.0d, new Emp[0]);
        Emp e1 = new Emp(2,"mark01",1200.0d,null);
        Emp e2 = new Emp(3,"mark02",2200.0d,null);
        Emp e3 = new Emp(4,"mark03",1200.0d,null);
        Emp e4 = new Emp(5,"mark04",2300.0d,null);
        Emp e5 = new Emp(6,"mark05",1200.0d,null);
        EmpBiz biz = new EmpBiz();
        biz.add(boss,e1);
        biz.add(boss,e2);
        biz.add(boss,e3);
        biz.add(boss,e4);
        biz.add(boss,e5);

        biz.delBySalary(boss,2200.0d);

        biz.getAllEmp(boss);
    }
}

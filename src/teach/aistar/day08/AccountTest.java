package teach.aistar.day08;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 10:52
 */
public class AccountTest {
    public static void main(String[] args) {
        Account ac1 = new Account(1, "rensheng", 2000);
        AccountBiz biz = new AccountBiz();
        System.out.println(biz.getMoney(ac1, 200));
        biz.saveMoney(ac1,2000);
        System.out.println(ac1.getBalance());

    }
}

package teach.aistar.day08;

/**
 * @author 任胜
 * @version 1.0
 * @data 2023/7/26 10:44
 */
public class AccountBiz {
    public  double getMoney(Account account,double balance){
        double getmoney=account.getBalance()-balance;
        account.setBalance(getmoney);
        return getmoney;
    }
    public  void saveMoney(Account account,double balance){
       account.setBalance(account.getBalance()+balance);
    }
}

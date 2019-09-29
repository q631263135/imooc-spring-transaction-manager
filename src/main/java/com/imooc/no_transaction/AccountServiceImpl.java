package com.imooc.no_transaction;


/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/9/26 13:16
 */
public class AccountServiceImpl implements AccountService {


    private AccountDao accountDao;

    @Override
    public void moneyOut(String out, double money) {
        accountDao.moneyOut(out, money);
    }

    @Override
    public void moneyIn(String in, double money) {
        accountDao.moneyIn(in, money);
    }

    @Override
    public void trans() {
        accountDao.moneyIn("aaa", 100);
        System.out.println(1 / 0);
        accountDao.moneyOut("bbb", 100);
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public AccountDao getAccountDao() {
        return accountDao;
    }
}

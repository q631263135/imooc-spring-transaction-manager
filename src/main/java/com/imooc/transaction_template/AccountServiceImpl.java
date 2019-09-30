package com.imooc.transaction_template;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/9/26 13:16
 */
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;
    private TransactionTemplate transactionTemplate;

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
        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus status) {
                accountDao.moneyIn("aaa", 100);
                System.out.println(1 / 0);
                accountDao.moneyOut("bbb", 100);
            }
        });
    }

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

}

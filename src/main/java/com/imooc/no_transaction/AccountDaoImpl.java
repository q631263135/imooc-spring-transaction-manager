package com.imooc.no_transaction;

import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/9/26 13:18
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {

    @Override
    public void moneyOut(String out, double money) {

    }

    @Override
    public void moneyIn(String in, double money) {

    }
}

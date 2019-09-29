package com.imooc.transaction_templdate;

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

        String sql = "update account set money = money - ? where name = ?";

        this.getJdbcTemplate().update(sql, money, out);
    }

    @Override
    public void moneyIn(String in, double money) {
        String sql = "update account set money = money + ? where name = ?";
        this.getJdbcTemplate().update(sql, money, in);

    }
}

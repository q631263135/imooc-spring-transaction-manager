package com.imooc.transaction_templdate;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/9/26 13:17
 */
public interface AccountDao {
    void moneyOut(String out, double money);

    void moneyIn(String in, double money);
}

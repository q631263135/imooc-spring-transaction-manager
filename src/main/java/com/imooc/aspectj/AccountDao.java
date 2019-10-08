package com.imooc.aspectj;

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

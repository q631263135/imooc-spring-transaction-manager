package com.imooc.transaction_template;

/**
 * <br/>
 *
 * @author yangchaozheng
 * @date 2019/9/26 13:15
 */
public interface AccountService {

    void moneyOut(String out, double money);

    void moneyIn(String in, double money);

    void trans();
}

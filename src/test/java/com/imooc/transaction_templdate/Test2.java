package com.imooc.transaction_templdate;

import static org.junit.Assert.*;

import com.imooc.transaction_templdate.AccountService;
import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;


@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext1.xml")
public class Test2 {
    @Resource
    private AccountService accountService;

    @Test
    public void trans() {
        accountService.trans();
    }
}
package com.imooc.aspectj;

import static org.junit.Assert.*;

import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext3.xml")
public class Test4 {

    @Resource
    private AccountService accountService;

    @Test
    public void trans() {
        accountService.trans();
    }

}
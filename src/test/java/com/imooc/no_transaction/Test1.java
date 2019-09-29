package com.imooc.no_transaction;


import javax.annotation.Resource;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:applicationContext.xml")
public class Test1 {

    @Resource
    private AccountService accountService;

    @Test
    public void test() {
        accountService.trans();
// output~:
//        ERROR StatusLogger No Log4j 2 configuration file found. Using default configuration (logging only errors to the console), or user programmatically provided configurations. Set system property 'log4j2.debug' to show Log4j 2 internal initialization logging. See https://logging.apache.org/log4j/2.x/manual/configuration.html for instructions on how to configure Log4j 2
//        九月 26, 2019 1:51:13 下午 com.mchange.v2.log.MLog
//        信息: MLog clients using java 1.4+ standard logging.
//                九月 26, 2019 1:51:13 下午 com.mchange.v2.c3p0.C3P0Registry
//        信息: Initializing c3p0-0.9.5.2 [built 08-December-2015 22:06:04 -0800; debug? true; trace: 10]
    }
}
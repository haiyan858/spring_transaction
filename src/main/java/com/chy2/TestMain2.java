package com.chy2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author cuihaiyan
 * @Create_Time 2020-02-27 22:16
 * @Description: spring 声明式事务管理方式一：基于TransactionProxyFactoryBean的方式的XML方式配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
public class TestMain2 {

    //@Resource(name = "accountService")
    @Resource(name = "accountServiceProxy")
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("aaa","bbb",300d);
    }
}

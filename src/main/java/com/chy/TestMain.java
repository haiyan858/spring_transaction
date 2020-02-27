package com.chy;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author cuihaiyan
 * @Create_Time 2020-02-27 22:16
 * @Description: spring 编程事务管理方式
 */

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext.xml")
public class TestMain {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("aaa","bbb",200d);
    }
}

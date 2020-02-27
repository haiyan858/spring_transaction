package com.chy3;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import javax.annotation.Resource;

/**
 * @Author cuihaiyan
 * @Create_Time 2020-02-27 22:16
 * @Description: spring 声明式事务管理方式二：基于AspectJ 的XML方式配置
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext3.xml")
public class TestMain3 {

    @Resource(name = "accountService")
    private AccountService accountService;

    @Test
    public void demo1(){
        accountService.transfer("aaa","bbb",200d);
    }
}

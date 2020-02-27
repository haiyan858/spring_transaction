package com.chy4;


import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author cuihaiyan
 * @Create_Time 2020-02-27 18:48
 * @Description:
 */

//@Transactional(propagation = Propagation.REQUIRED,isolation = Isolation.DEFAULT,readOnly = true,noRollbackFor = , rollbackFor = )
@Transactional
public class AccountServiceImpl implements AccountService {

    private AccountDao accountDao;

    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    @Override
    public void transfer(String out, String in, Double money) {
        accountDao.outMoney(out, money); //提交
        int i = 1 / 0; // 异常 java.lang.ArithmeticException: / by zero
        accountDao.inMoney(in, money); //不提交

    }
}

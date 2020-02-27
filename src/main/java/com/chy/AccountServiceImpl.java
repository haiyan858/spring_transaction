package com.chy;


import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * @Author cuihaiyan
 * @Create_Time 2020-02-27 18:48
 * @Description:
 */
public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;
    public void setAccountDao(AccountDao accountDao) {
        this.accountDao = accountDao;
    }

    private TransactionTemplate transactionTemplate;

    public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
        this.transactionTemplate = transactionTemplate;
    }

    @Override
    public void transfer(String out, String in, Double money) {
       /*
       accountDao.outMoney(out,money); //提交
        int i = 1/0; // 异常 java.lang.ArithmeticException: / by zero
        accountDao.inMoney(in,money); //不提交
      */

        transactionTemplate.execute(new TransactionCallbackWithoutResult() {
            @Override
            protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
                accountDao.outMoney(out,money); //提交
                //int i = 1/0; // 异常 java.lang.ArithmeticException: / by zero
                accountDao.inMoney(in,money); //不提交
            }
        });

    }
}

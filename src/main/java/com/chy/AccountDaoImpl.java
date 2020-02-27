package com.chy;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.support.JdbcDaoSupport;

/**
 * @Author cuihaiyan
 * @Create_Time 2020-02-27 22:07
 * @Description:
 */
public class AccountDaoImpl extends JdbcDaoSupport implements AccountDao {
    @Override
    public void outMoney(String out, Double money) {
        String sql = "update account set money = money - ? where name = ? ";
        this.getJdbcTemplate().update(sql,money,out);

    }

    @Override
    public void inMoney(String in, Double money) {
        String sql = "update account set money = money + ? where name = ? ";
        this.getJdbcTemplate().update(sql,money,in);
    }
}

package com.chy2;

/**
 * @Author cuihaiyan
 * @Create_Time 2020-02-27 21:43
 * @Description:
 */
public interface AccountDao {
    /**
     *
     * @param out 转出账号
     * @param money 转出金额
     */
    public void outMoney(String out, Double money);

    /**
     *
     * @param in 转入账号
     * @param money 转入金额
     */
    public void inMoney(String in, Double money);

}

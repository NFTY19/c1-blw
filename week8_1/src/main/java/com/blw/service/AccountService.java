package com.blw.service;

import com.blw.entity.Account;
import com.blw.mapper.AccountDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class AccountService {

    @Autowired
    private AccountDao accountDao;
    // 1查询所有记录
    public List<Account> findAll() {
        return accountDao.findAll();
    }
    // 2通过id删除记录
    public void deleteByPrimaryKey(String id) {
        accountDao.deleteByPrimaryKey(id);
    }
    // 3插入记录
    public void insert(Account record) {
        accountDao.insert(record);
    }
    // 4通过id查找对象
    public Account selectByPrimaryKey(String id) {
        return accountDao.selectByPrimaryKey(id);
    }
    // 5更新Account
    public void updateByPrimaryKey(Account record) {
        accountDao.updateByPrimaryKey(record);
    }
    // 6转账功能 输入转出人id，转入人id，转账金额 实现转账
    public void transfer(String remitterId,String remitteeId,int money) {
        Account remitter = selectByPrimaryKey(remitterId);
        Account remittee = selectByPrimaryKey(remitteeId);

        remitter.setMoney(remitter.getMoney() - money);
        remitter.setUpdatetime(new Date(System.currentTimeMillis()));
        accountDao.updateByPrimaryKey(remitter);

        remittee.setMoney(remittee.getMoney() + money);
        remittee.setUpdatetime(new Date(System.currentTimeMillis()));
        accountDao.updateByPrimaryKey(remittee);
    }
}

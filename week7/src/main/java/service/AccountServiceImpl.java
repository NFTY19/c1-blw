package service;

import entity.Account;
import mapper.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.Date;
import java.util.List;

public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;
    private SqlSession session;

    public AccountServiceImpl() throws IOException {
        //1.读取mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建 SqlSessionFactory 的构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.使用构建者创建工厂对象 SqlSessionFactory
        SqlSessionFactory factory = builder.build(in);
        //4.使用 SqlSessionFactory 生产 SqlSession 对象
        session = factory.openSession(false);//手动提交事务
        //5.使用 SqlSession 创建 dao 接口的代理对象
        accountDao = session.getMapper(AccountDao.class);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void deleteByPrimaryKey(String id) {
        accountDao.deleteByPrimaryKey(id);
        session.commit();
    }

    public void insert(Account record) {
        accountDao.insert(record);
        session.commit();
    }

    public Account selectByPrimaryKey(String id) {
        return accountDao.selectByPrimaryKey(id);
    }

    public void updateByPrimaryKey(Account record) {
        accountDao.updateByPrimaryKey(record);
        session.commit();
    }

    public void transfer(String remitterId, String remitteeId, int money) {
        Account remitter = selectByPrimaryKey(remitterId);
        Account remittee = selectByPrimaryKey(remitteeId);

        remitter.setMoney(remitter.getMoney() - money);
        remitter.setUpdatetime(new Date(System.currentTimeMillis()));
        accountDao.updateByPrimaryKey(remitter);

        remittee.setMoney(remittee.getMoney() + money);
        remittee.setUpdatetime(new Date(System.currentTimeMillis()));
        accountDao.updateByPrimaryKey(remittee);

        session.commit();
    }
}

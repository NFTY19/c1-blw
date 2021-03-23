package service;

import entity.Account;
import mapper.AccountDao;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

public class AccountServiceImpl implements AccountService{

    private AccountDao accountDao;

    public AccountServiceImpl() throws IOException {
        //1.读取mybatis的配置文件
        InputStream in = Resources.getResourceAsStream("mybatis-config.xml");
        //2.创建 SqlSessionFactory 的构建者对象
        SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
        //3.使用构建者创建工厂对象 SqlSessionFactory
        SqlSessionFactory factory = builder.build(in);
        //4.使用 SqlSessionFactory 生产 SqlSession 对象
        SqlSession session = factory.openSession(true);//自动提交事务
        //5.使用 SqlSession 创建 dao 接口的代理对象
        accountDao = session.getMapper(AccountDao.class);
    }

    public List<Account> findAll() {
        return accountDao.findAll();
    }

    public void deleteByPrimaryKey(String id) {
        accountDao.deleteByPrimaryKey(id);
    }

    public void insert(Account record) {
        accountDao.insert(record);
    }

    public Account selectByPrimaryKey(String id) {
        return accountDao.selectByPrimaryKey(id);
    }

    public void updateByPrimaryKey(Account record) {
        accountDao.updateByPrimaryKey(record);
    }

    public void transfer(String remitterId, String remitteeId, int money) {

    }
}

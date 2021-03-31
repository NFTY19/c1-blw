package com.blw.test;

import com.blw.MybatisRunApplication;
import com.blw.entity.Account;
import com.blw.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Calendar;
import java.util.Date;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = MybatisRunApplication.class)
public class MyTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void testInsert() {
        accountService.insert(new Account("1","jack", 1000, new Date(121, Calendar.MARCH, 11), new Date(System.currentTimeMillis())));
        accountService.insert(new Account("2","tom", 500, new Date(121, Calendar.MARCH, 11), new Date(System.currentTimeMillis())));
        accountService.insert(new Account("3","micky", 800, new Date(121, Calendar.MARCH, 11), new Date(System.currentTimeMillis())));
        accountService.insert(new Account("50","duck", 100, new Date(121, Calendar.MARCH, 29), new Date(System.currentTimeMillis())));
    }

    @Test
    public void testTransfer() {
        accountService.transfer("1", "50", 500);
    }
}

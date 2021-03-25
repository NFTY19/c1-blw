import entity.Account;
import service.AccountService;
import service.AccountServiceImpl;

import java.io.IOException;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Test {
    @org.junit.Test
    public void task1() throws IOException {
        AccountService accountService = new AccountServiceImpl();

        Calendar calendar=Calendar.getInstance();
        calendar.set(2021, Calendar.MARCH, 10);
        Date date=calendar.getTime();//date就是你需要的时间

        accountService.insert(new Account("1","jack", 1000, date, new Date(System.currentTimeMillis())));
        accountService.insert(new Account("2","tom", 500, date, new Date(System.currentTimeMillis())));
        accountService.insert(new Account("3","micky", 800, date, new Date(System.currentTimeMillis())));

        List<Account> accounts = accountService.findAll();
        for (Account a : accounts) {
            System.out.println(a);
        }
    }

    @org.junit.Test
    public void task2() throws IOException {
        AccountService accountService = new AccountServiceImpl();

        accountService.transfer("1", "2", 500);
        List<Account> accounts = accountService.findAll();
        for (Account a : accounts) {
            System.out.println(a);
        }
    }
}

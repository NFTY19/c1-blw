package com.blw.controller;

import com.blw.entity.Account;
import com.blw.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@ResponseBody //返回报文而不是跳转或者重定向
@Controller
public class AccountController {
    @Autowired
    private AccountService accountService;
    // 不用Rest风格
//查询所有
    @RequestMapping("/account/all")
    public List<Account> findAll() {
        return accountService.findAll();
    }
    //保存account对象
    /*json
    {
        "id": "30",
        "name": "duck",
        "createtime": "2021-03-10T00:00:00.000+0000",
        "updatetime": "2021-04-01T00:00:00.000+0000",
        "money": 100
    }
     */
    @RequestMapping("/account/save")
    public void saveAccount(@RequestBody Account account) {
        accountService.insert(account);
    }

    @RequestMapping("/account/transfer")
    public void transfer(@RequestParam("remitterId") String remitterId,
                         @RequestParam("remitteeId") String remitteeId,
                         @RequestParam("money") int money) {
        accountService.transfer(remitterId,remitteeId,money);
    }
}


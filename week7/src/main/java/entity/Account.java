package entity;

import java.io.Serializable;
import java.util.Date;
/*
    #mybatis
    USE homework;
    CREATE TABLE account(
        id VARCHAR(255) NOT NULL PRIMARY KEY,
        NAME VARCHAR(255),
        money INT,
        createtime DATE,
        updatetime DATE
    );
 */
public class Account implements Serializable {
    private String id;
    private String name;
    private int Money;
    private Date createtime;
    private Date updatetime;

    public Account(String id, String name, int money, Date createtime, Date updatetime) {
        this.id = id;
        this.name = name;
        Money = money;
        this.createtime = createtime;
        this.updatetime = updatetime;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", Money=" + Money +
                ", createtime=" + createtime +
                ", updatetime=" + updatetime +
                '}';
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return Money;
    }

    public void setMoney(int money) {
        Money = money;
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getUpdatetime() {
        return updatetime;
    }

    public void setUpdatetime(Date updatetime) {
        this.updatetime = updatetime;
    }
}

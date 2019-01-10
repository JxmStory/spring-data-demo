package com.sh.domain;

import javax.persistence.*;
import java.io.Serializable;

/**
 * @Auther: admin
 * @Date: 2019/1/4 11:47
 * @Description:
 */

@Entity
@Table(name = "admin")
public class Admin implements Serializable {

    private static final long serialVersionUID = -8505150090313324815L;

    @Id
    @GeneratedValue
    @Column(name = "id")
    private Integer id;

    @Column(name = "account", length = 32)
    private String account;

    @Column(name = "password", length = 32)
    private String password;

    @Column(name = "sort")
    private Integer sort;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", password='" + password + '\'' +
                ", sort=" + sort +
                '}';
    }
}

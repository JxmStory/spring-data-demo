package com.sh.repository;

import com.sh.domain.Admin;
import com.sh.service.AdminService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/7 10:16
 * @Description:
 */
public class AdminRepositoryTest {
    private ApplicationContext ctx = null;
    private AdminService adminService = null;

    @Before
    public void befor(){
        ctx = new ClassPathXmlApplicationContext("new-beans.xml");
        adminService = ctx.getBean(AdminService.class);
        System.out.println("befor");
    }

    @After
    public void after(){
        ctx = null;
        System.out.println("after");
    }

    @Test
    public void findByAccount(){
        Admin admin = adminService.findByAccount("123456");
        System.out.println(admin.toString());
    }

    @Test
    public void findByAccountInOrSortBetween(){
        List<String> account = new ArrayList<>();
        account.add("123451");
        account.add("123452");
        account.add("123453");
        Integer maxsort = 5;
        Integer minsort = 3;
        List<Admin> list = adminService.findByAccountInOrSortBetween(account, maxsort, minsort);
    }

    @Test
    public void updateAndSave(){
        Admin admin = new Admin();
        admin.setId(2);
        admin.setAccount("111111");
        admin.setPassword("222222");
        admin.setSort(2);
        adminService.updateAndSave(admin);
    }
}

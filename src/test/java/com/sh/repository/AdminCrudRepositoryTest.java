package com.sh.repository;

import com.sh.domain.Admin;
import com.sh.service.AdminCrudService;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/7 10:56
 * @Description:
 */
public class AdminCrudRepositoryTest {

    private ApplicationContext ctx = null;
    private AdminCrudService adminCrudService = null;

    @Before
    public void befor(){
        ctx = new ClassPathXmlApplicationContext("new-beans.xml");
        adminCrudService = ctx.getBean(AdminCrudService.class);
        System.out.println("befor");
    }

    @After
    public void after(){
        ctx = null;
        System.out.println("after");
    }

    @Test
    public void saveOne(){
        Admin admin = new Admin();
        admin.setAccount("123456");
        admin.setPassword("123456");
        admin.setSort(1);
        adminCrudService.save(admin);
    }

    @Test
    public void saveList(){
        List<Admin> list = new ArrayList<>();
        for(int i=2; i<20; i++){
            Admin admin = new Admin();
            admin.setAccount("12345"+i);
            admin.setPassword("123456");
            admin.setSort(i);
            list.add(admin);
        }
        adminCrudService.save(list);
    }
}

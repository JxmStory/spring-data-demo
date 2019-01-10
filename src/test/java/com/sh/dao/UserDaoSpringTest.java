package com.sh.dao;

import com.sh.domain.User;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/4 10:53
 * @Description:
 */
public class UserDaoSpringTest {

    private ApplicationContext ctx;
    private UserDaoInter userDao;

    @Before
    public void befor(){
        System.out.println("befor");
        ctx = new ClassPathXmlApplicationContext("beans.xml");
        userDao = (UserDaoInter) ctx.getBean("userDaoSpring");
    }

    @After
    public void after(){
        System.out.println("after");
        ctx = null;
    }

    @Test
    public void query(){
        System.out.println("test……");
        List<User> list = userDao.query();
        for(User user : list){
            System.out.println(user.toString());
        }
    }

    @Test
    public void save(){
        System.out.println("test……");
        User user = new User();
        user.setName("songhui");
        user.setAge(27);
        userDao.save(user);
    }

}

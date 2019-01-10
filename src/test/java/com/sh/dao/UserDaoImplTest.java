package com.sh.dao;

import com.sh.domain.User;
import org.junit.Test;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/3 13:28
 * @Description:
 */
public class UserDaoImplTest {

    private UserDaoInter userDao;

    @Test
    public void query(){
        userDao = new UserDaoImpl();
        List<User> list = userDao.query();
        for (User user : list) {
            System.out.println(user.toString());
        }
    }


    @Test
    public void save(){
        userDao = new UserDaoImpl();
        User user = new User();
        user.setName("chenchen");
        user.setAge(26);
        userDao.save(user);
    }

}

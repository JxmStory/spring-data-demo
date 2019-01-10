package com.sh.dao;

import com.sh.domain.User;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/3 09:43
 * @Description:
 */
public interface UserDaoInter {


    /**
     * 功能描述: 查询用户
     * @param:
     * @return:
     * @auther: admin
     * @date: 2019/1/3 9:45
     */
    List<User> query();

    /**
     * 功能描述: 添加用户
     * @param:
     * @return:
     * @auther: admin
     * @date: 2019/1/3 9:45
     */
    void save(User user);
}

package com.sh.dao;

import com.sh.domain.User;
import com.sh.util.JDBCUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/3 09:46
 * @Description:
 */
public class UserDaoImpl implements UserDaoInter {

    public List<User> query(){
        List<User> list = new ArrayList<User>();
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "select id,name,age from user";
            ps = connection.prepareStatement(sql);
            rs = ps.executeQuery();
            User user = null;
            while (rs.next()){
                user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                list.add(user);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection, ps, rs);
        }
        return list;
    }

    public void save(User user) {
        Connection connection = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try {
            connection = JDBCUtil.getConnection();
            String sql = "insert into user (name,age) values (?,?)";
            ps = connection.prepareStatement(sql);
            ps.setString(1, user.getName());
            ps.setInt(2, user.getAge());
            ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            JDBCUtil.close(connection, ps, rs);
        }
    }
}

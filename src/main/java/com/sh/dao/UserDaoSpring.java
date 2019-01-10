package com.sh.dao;

import com.sh.domain.User;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowCallbackHandler;

import javax.xml.transform.Templates;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/4 10:29
 * @Description:
 */
public class UserDaoSpring implements UserDaoInter {

    private JdbcTemplate jdbcTemplate;

    @Override
    public List<User> query() {
        List<User> list = new ArrayList<User>();
        String sql = "select * from user";
        jdbcTemplate.query(sql, (RowCallbackHandler) (rs) -> {
            while (rs.next()){
                User user = new User();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setAge(rs.getInt("age"));
                list.add(user);
            }
        });
        return list;
    }

    @Override
    public void save(User user) {
        String sql = "insert into user (name,age) values (?,?)";
        jdbcTemplate.update(sql, new Object[]{user.getName(), user.getAge()});
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}

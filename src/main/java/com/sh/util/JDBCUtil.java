package com.sh.util;

import java.io.IOException;
import java.io.InputStream;
import java.sql.*;
import java.util.Properties;

/**
 * @Auther: admin
 * @Date: 2019/1/3 09:29
 * @Description:
 */
public class JDBCUtil {

    /**
     * 获取Connection
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public static Connection getConnection() throws Exception {

        InputStream inputStream = JDBCUtil.class.getClassLoader().getResourceAsStream("db.properties");
        Properties properties = new Properties();
        properties.load(inputStream);

//        String driverClassName = "com.mysql.jdbc.Driver";
//        String url = "jdbc:mysql://127.0.0.1:3306/springdata?useSSL=false";
//        String username = "root";
//        String password = "1234";

        String driverClassName = properties.getProperty("jdbc.driver");
        String url = properties.getProperty("jdbc.url");
        String username = properties.getProperty("jdbc.username");
        String password = properties.getProperty("jdbc.password");

        Class.forName(driverClassName);
        Connection connection = DriverManager.getConnection(url, username, password);
        return connection;
    }


    /**
     * 释放资源
     * @param conn
     * @param ps
     * @param rs
     * @throws SQLException
     */
    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {
        if(conn != null){
            try {
                conn.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(ps != null){
            try {
                ps.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

        if(rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }

    }
}

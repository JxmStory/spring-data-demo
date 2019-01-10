package com.sh.util;

import org.junit.Assert;
import org.junit.Test;

import java.sql.Connection;

/**
 * @Auther: admin
 * @Date: 2019/1/3 10:07
 * @Description:
 */
public class JDBCUtilTest {

    @Test
    public void testGetConnection() throws Exception {
        Connection connection = JDBCUtil.getConnection();
        Assert.assertNotNull(connection);
    }
}

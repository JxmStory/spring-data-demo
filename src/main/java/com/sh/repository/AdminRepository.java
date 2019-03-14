package com.sh.repository;

import com.sh.domain.Admin;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;
import org.springframework.data.repository.query.Param;
import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/7 10:10
 * @Description: 继承Repository(标记接口) 即只提供自定义方法
 */
public interface AdminRepository extends Repository<Admin, Integer> {

    // where account=?
    Admin findByAccount(String account);

    // where account=? and password=?
    Admin findByAccountAndPassword(String account, String password);

    // where account like ?
    Admin findByAccountLike(String account);

    // where account like ?% and sort<?
    List<Admin> findByAccountStartingWithAndSortLessThan(String account, Integer sort);

    // where account like %? and sort>?
    List<Admin> findByAccountEndingWithAndSortGreaterThan(String account, Integer sort);

    // where account in (?,?....) or (sort<? and sort>?)
    List<Admin> findByAccountInOrSortBetween(List<String> account, Integer maxsort, Integer minsort);

    // where account=? order by sort desc
    List<Admin> findByAccountOrderBySortDesc(String account);

    @Query("select a from Admin a where a.id=(select max(id) from Admin)")
    Admin getEmployeeByMaxId();

    @Query("select a from Admin a where a.account=?1 and a.password=?2")
    List<Admin> queryParams1(String account, String password);

    @Query("select a from Admin a where a.account=:account and a.password=:password")
    List<Admin> queryParams2(@Param("account")String account, @Param("password")String password);

    @Query("select count(id) from Admin where account like %?1%")
    long count(String account);

    //使用原生sql语句 开启nativeQuery
    @Query(nativeQuery = true, value = "select count(1) from admin")
    long getCount();

    //@Modifying 执行UPDATE和DELETE时需要声明
    @Modifying
    @Query("update Admin a set a.password = :password where a.id = :id")
    public void update(@Param("id")Integer id, @Param("password")String password);

}

package com.sh.repository;

import com.sh.domain.Admin;
import org.springframework.data.repository.CrudRepository;

/**
 * @Auther: admin
 * @Date: 2019/1/7 10:50
 * @Description:
 */
public interface AdminCrudRepository extends CrudRepository<Admin,Integer> {
}

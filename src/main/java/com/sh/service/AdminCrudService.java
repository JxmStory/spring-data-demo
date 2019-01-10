package com.sh.service;

import com.sh.domain.Admin;
import com.sh.repository.AdminCrudRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/7 10:52
 * @Description:
 */

@Service
public class AdminCrudService {

    @Autowired
    private AdminCrudRepository adminCrudRepository;

    // Crud中的save 不存在新增 存在则更新
    public void save(Admin admin){
        adminCrudRepository.save(admin);
    }

    public void save(List<Admin> list){
        adminCrudRepository.save(list);
    }
}

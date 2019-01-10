package com.sh.service;

import com.sh.domain.Admin;
import com.sh.repository.AdminCrudRepository;
import com.sh.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

/**
 * @Auther: admin
 * @Date: 2019/1/7 10:53
 * @Description:
 */
@Service
public class AdminService {

    @Autowired
    private AdminRepository adminRepository;

    @Autowired
    private AdminCrudRepository adminCrudRepository;

    public Admin findByAccount(String account){
        return adminRepository.findByAccount(account);
    }

    public List<Admin> findByAccountInOrSortBetween(List<String> account, Integer maxsort, Integer minsort){
        return adminRepository.findByAccountInOrSortBetween(account, maxsort, minsort);
    }

    @Transactional
    public void updateAndSave(Admin admin){
        adminRepository.update(admin.getId(), admin.getPassword());
//        int i = 1/0;
//        adminCrudRepository.save(admin);
    }
}

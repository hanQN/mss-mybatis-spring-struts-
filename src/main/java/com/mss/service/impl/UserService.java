package com.mss.service.impl;

import com.mss.bean.User;
import com.mss.dao.IUserDao;
import com.mss.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * Created by 123 on 2018/4/27.
 */
@Service
@Transactional
public class UserService implements IUserService {

    @Autowired
    IUserDao userdao;

    @Override
    public void addUser(User user) {
        userdao.addUser(user);
    }

    @Override
    public void delUser(Integer id) {
        userdao.delUser(id);
    }

    @Override
    public User getUserbyId(Integer id) {
        return userdao.getUserbyId(id);
    }

    @Override
    public List<User> getAllUser() {
        return userdao.getAllUser();
    }
}

package com.mss.service;

import com.mss.bean.User;

import java.util.List;

/**
 * Created by 123 on 2018/4/27.
 */
public interface IUserService {

    public void addUser(User user);

    public void delUser(Integer id);

    public User getUserbyId(Integer id);

    public List<User> getAllUser();
}

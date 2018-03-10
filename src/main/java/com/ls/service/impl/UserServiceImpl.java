package com.ls.service.impl;

import com.ls.dao.IUserDao;
import com.ls.entity.User;
import com.ls.service.UserService;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserServiceImpl implements UserService{

    @Resource(name = "userDao")
    private IUserDao userDao;

    @Override
    public List<User> getUser() {
    	System.out.println(userDao.selectAllUser());
        return userDao.selectAllUser();
    }
}

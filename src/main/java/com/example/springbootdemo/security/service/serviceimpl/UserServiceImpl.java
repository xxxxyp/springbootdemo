package com.example.springbootdemo.security.service.serviceimpl;

import com.example.springbootdemo.security.dao.UserDao;
import com.example.springbootdemo.security.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserDao userDao;
    @Override
    public String getPassword(String username) {
        return userDao.getPassword(username);
    }
}

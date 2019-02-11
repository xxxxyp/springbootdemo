package com.example.springbootdemo.security.dao;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserDao {

    public String getPassword(String username);
}

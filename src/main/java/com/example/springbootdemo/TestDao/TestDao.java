package com.example.springbootdemo.TestDao;

import com.example.springbootdemo.TestPojo.TestPojo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface TestDao {

    public TestPojo findByPrimarkey(Integer id);

    public List<TestPojo> findAll();

    public Integer allRows();
}

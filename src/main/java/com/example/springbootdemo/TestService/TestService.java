package com.example.springbootdemo.TestService;

import com.example.springbootdemo.TestPojo.TestPojo;
import org.springframework.stereotype.Service;

import java.util.List;

public interface TestService {

    public TestPojo findByPrimarkey(Integer id);

    public List<TestPojo> findItemByPage(Integer currentpage,Integer pagesize);

    public void run1();
}

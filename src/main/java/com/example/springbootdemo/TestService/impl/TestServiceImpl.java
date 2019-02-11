package com.example.springbootdemo.TestService.impl;

import com.example.springbootdemo.TestDao.DonDao;
import com.example.springbootdemo.TestDao.TestDao;
import com.example.springbootdemo.TestPojo.PageBean;
import com.example.springbootdemo.TestPojo.TestPojo;
import com.example.springbootdemo.TestService.TestService;
import com.example.springbootdemo.aop.TLog;
import com.github.pagehelper.PageHelper;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureBefore;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class TestServiceImpl implements TestService {

//    @Resource
//    private TestDao testDao;
    @Resource
    private TestDao testDao;
//    @Resource(name="Don")
//    private DonDao donDao;
    @TLog
    private Logger tlog;

    private Logger log = Logger.getLogger(TestServiceImpl.class);
    @Override
    public TestPojo findByPrimarkey(Integer id) {
        return testDao.findByPrimarkey(id);
    }


    @Override
    public List<TestPojo> findItemByPage(Integer currentpage, Integer pagesize) {
        PageHelper.startPage(currentpage,pagesize);
        List<TestPojo> alllist = testDao.findAll();
        Integer rows = testDao.allRows();
        PageBean<TestPojo> pagedata = new PageBean<>(currentpage, pagesize, rows);
        pagedata.setItems(alllist);
        return pagedata.getItems();
    }


    @Override
    public void run1() {
//        tlog.info("我是古天乐，传奇霸业，是兄弟就来砍我。");
        log.info("我是成龙，传奇霸业，是兄弟就来砍我。");
        System.out.println("迪丽热巴！");
        System.out.println("谁给你的胆子，杨幂吗？");
    }
}
